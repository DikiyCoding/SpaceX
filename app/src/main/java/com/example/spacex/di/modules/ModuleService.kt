package com.example.spacex.di.modules

import com.example.spacex.api.service.SpaceXService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class ModuleService {

    @Provides
    @Singleton
    fun provideSpaceXService(retrofit: Retrofit): SpaceXService =
        retrofit.create(SpaceXService::class.java)
}
