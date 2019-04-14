package com.example.spacex.ui.viewmodels

import com.example.spacex.api.response.Launch
import com.example.spacex.model.DetailsModel
import com.example.spacex.ui.views.DetailsActivity
import com.stfalcon.androidmvvmhelper.mvvm.activities.ActivityViewModel
import javax.inject.Inject

class DetailsViewModel(
    activity: DetailsActivity,
    private val position: Int
) : ActivityViewModel<DetailsActivity>(activity) {

    @Inject
    lateinit var model: DetailsModel

    fun getItem(): Launch? =
        model.getItem(position)
}
