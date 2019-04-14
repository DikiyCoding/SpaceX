package com.example.spacex.ui.views

import com.example.spacex.BR
import com.example.spacex.R
import com.example.spacex.databinding.ActivityDetailsBinding
import com.example.spacex.ui.viewmodels.DetailsViewModel
import com.example.spacex.utils.app.App
import com.stfalcon.androidmvvmhelper.mvvm.activities.BindingActivity

class DetailsActivity : BindingActivity<ActivityDetailsBinding, DetailsViewModel>() {

    override fun onCreate(): DetailsViewModel {
        val detailsViewModel = DetailsViewModel(this, intent.getIntExtra("position", 0))
        App.appComponent.injectDetailsViewModel(detailsViewModel)
        return detailsViewModel
    }

    override fun getVariable(): Int {
        return BR.viewModelDetails
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_details
    }
}
