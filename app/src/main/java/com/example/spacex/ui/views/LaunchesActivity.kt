package com.example.spacex.ui.views

import android.arch.paging.PagedList
import android.content.Intent
import android.support.v4.app.ActivityOptionsCompat
import android.support.v4.view.ViewCompat
import com.example.spacex.BR
import com.example.spacex.R
import com.example.spacex.api.response.Launch
import com.example.spacex.databinding.ActivityLaunchesBinding
import com.example.spacex.ui.adapters.LaunchesAdapter
import com.example.spacex.ui.viewmodels.LaunchesViewModel
import com.example.spacex.utils.app.App
import com.example.spacex.utils.app.Constants
import com.example.spacex.utils.paged_list.LaunchesDiffUtil
import com.example.spacex.utils.paged_list.SideMarginDecoration
import com.stfalcon.androidmvvmhelper.mvvm.activities.BindingActivity
import kotlinx.android.synthetic.main.activity_launches.*
import javax.inject.Inject

class LaunchesActivity : BindingActivity<ActivityLaunchesBinding, LaunchesViewModel>() {

    @Inject
    lateinit var diffUtil: LaunchesDiffUtil
    @Inject
    lateinit var pagedList: PagedList<Launch>

    private lateinit var intentDetails: Intent
    private lateinit var adapter: LaunchesAdapter
    private lateinit var options: ActivityOptionsCompat

    override fun onCreate(): LaunchesViewModel {
        val launchesViewModel = LaunchesViewModel(this)
        App.appComponent.injectLaunchesViewModel(launchesViewModel)
        App.appComponent.injectLaunchesActivity(this)
        init()
        return launchesViewModel
    }

    override fun getVariable(): Int =
        BR.viewModelLaunches

    override fun getLayoutId(): Int =
        R.layout.activity_launches

    private fun init() {
        intentDetails = Intent(this, DetailsActivity::class.java)
        adapter = LaunchesAdapter(diffUtil) { callback ->
            intentDetails.putExtra("position", callback.position)
            options = ViewCompat.getTransitionName(callback.imageView).let {
                ActivityOptionsCompat
                    .makeSceneTransitionAnimation(this, callback.imageView, it.toString())
            }
            startActivity(intentDetails, options.toBundle())
        }
        adapter.submitList(pagedList)
        list_launches.adapter = adapter
        list_launches.addItemDecoration(SideMarginDecoration(Constants.itemSideMargin))
    }
}
