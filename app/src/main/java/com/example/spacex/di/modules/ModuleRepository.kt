package com.example.spacex.di.modules

import com.example.spacex.api.service.SpaceXService
import com.example.spacex.repository.network.RepositorySpaceX
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ModuleRepository {

    @Provides
    @Singleton
    fun provideTranslationRepository(spaceX: SpaceXService)
            : RepositorySpaceX = RepositorySpaceX(spaceX)
}
