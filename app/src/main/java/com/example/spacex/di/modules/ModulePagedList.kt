package com.example.spacex.di.modules

import android.arch.paging.PagedList
import com.example.spacex.api.response.Launch
import com.example.spacex.repository.network.RepositorySpaceX
import com.example.spacex.utils.app.Constants
import com.example.spacex.utils.paged_list.LaunchesDataSource
import com.example.spacex.utils.paged_list.LaunchesDiffUtil
import com.example.spacex.utils.paged_list.MainThreadExecutor
import dagger.Module
import dagger.Provides
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import javax.inject.Named
import javax.inject.Singleton

@Module
class ModulePagedList {

    @Provides
    @Singleton
    fun provideDiffUtil()
            : LaunchesDiffUtil =
        LaunchesDiffUtil()

    @Provides
    @Singleton
    fun provideDataSource(repository: RepositorySpaceX)
            : LaunchesDataSource =
        LaunchesDataSource(repository)

    @Provides
    @Singleton
    fun provideConfig()
            : PagedList.Config =
        PagedList.Config.Builder()
            .setEnablePlaceholders(false)
            .setPageSize(Constants.pageSizeDefValue)
            .build()

    @Provides
    @Singleton
    @Named("Fetch Executor")
    fun provideFetchExecutor()
            : Executor = Executors.newSingleThreadExecutor()

    @Provides
    @Singleton
    @Named("Notify Executor")
    fun provideNotifyExecutor()
            : Executor = MainThreadExecutor()

    @Provides
    @Singleton
    fun providePagedList(
        dataSource: LaunchesDataSource,
        config: PagedList.Config,
        @Named("Fetch Executor") fetchExecutor: Executor,
        @Named("Notify Executor") notifyExecutor: Executor
    )
            : PagedList<Launch> =
        PagedList.Builder(dataSource, config)
            .setFetchExecutor(fetchExecutor)
            .setNotifyExecutor(notifyExecutor)
            .build()
}
