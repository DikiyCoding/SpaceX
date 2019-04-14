package com.example.spacex.ui.viewmodels

import com.example.spacex.model.LaunchesModel
import com.example.spacex.ui.views.LaunchesActivity
import com.stfalcon.androidmvvmhelper.mvvm.activities.ActivityViewModel
import javax.inject.Inject

class LaunchesViewModel(activity: LaunchesActivity)
    : ActivityViewModel<LaunchesActivity>(activity) {

    @Inject
    lateinit var model: LaunchesModel
}
