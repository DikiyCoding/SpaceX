package com.example.spacex.di.components

import com.example.spacex.di.modules.*
import com.example.spacex.ui.viewmodels.DetailsViewModel
import com.example.spacex.ui.viewmodels.LaunchesViewModel
import com.example.spacex.ui.views.DetailsActivity
import com.example.spacex.ui.views.LaunchesActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ModuleApp::class,
        ModuleModel::class,
        ModuleNetwork::class,
        ModulePagedList::class,
        ModuleRepository::class,
        ModuleService::class
    ]
)
interface AppComponent {

    fun injectLaunchesViewModel(launchesViewModel: LaunchesViewModel)
    fun injectDetailsViewModel(detailsViewModel: DetailsViewModel)

    fun injectLaunchesActivity(launchesActivity: LaunchesActivity)
    fun injectDetailsActivity(detailsActivity: DetailsActivity)
}
