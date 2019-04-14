package com.example.spacex.di.modules

import android.content.Context
import com.example.spacex.utils.app.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ModuleApp(private val app: App) {

    @Provides
    @Singleton
    fun provideApp(): Context = app
}
