package com.example.spacex.utils.app

import android.app.Application
import com.example.spacex.di.components.AppComponent
import com.example.spacex.di.components.DaggerAppComponent
import com.example.spacex.di.modules.*

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .moduleApp(ModuleApp(this))
            .moduleModel(ModuleModel())
            .moduleNetwork(ModuleNetwork())
            .modulePagedList(ModulePagedList())
            .moduleRepository(ModuleRepository())
            .moduleService(ModuleService())
            .build()
    }

    companion object {
        lateinit var appComponent: AppComponent
    }
}
