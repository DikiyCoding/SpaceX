package com.example.spacex.di.modules

import android.arch.paging.PagedList
import com.example.spacex.api.response.Launch
import com.example.spacex.model.DetailsModel
import com.example.spacex.model.LaunchesModel
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ModuleModel {

    @Provides
    @Singleton
    fun provideLaunchesModel(
        pagedList: PagedList<Launch>
    ) : LaunchesModel = LaunchesModel(pagedList)

    @Provides
    @Singleton
    fun provideDetailsModel(
        pagedList: PagedList<Launch>
    ) : DetailsModel = DetailsModel(pagedList)
}
