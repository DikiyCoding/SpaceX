package com.example.spacex.di.modules

import com.example.spacex.utils.app.Constants
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
class ModuleNetwork {

    @Provides
    @Singleton
    @Named("SpaceX")
    fun provideBaseUrlString()
            : String = Constants.SPACEX_BASE_URL

    @Provides
    @Singleton
    fun provideOkHttpClient()
            : OkHttpClient =
        OkHttpClient
            .Builder()
            /*.addInterceptor(ApiKeyInterceptor.create())
            .addInterceptor(LoggingInterceptor.create())
            .addInterceptor(new StethoInterceptor())*/
            .build()

    @Provides
    @Singleton
    fun provideGsonConverterFactory()
            : GsonConverterFactory = GsonConverterFactory.create()

    @Provides
    @Singleton
    fun provideRxJava2CallAdapterFactory()
            : RxJava2CallAdapterFactory = RxJava2CallAdapterFactory.create()

    @Provides
    @Singleton
    fun provideRetrofit(
        @Named("SpaceX") url: String,
        client: OkHttpClient,
        converterFactory: GsonConverterFactory,
        callAdapterFactory: RxJava2CallAdapterFactory
    ): Retrofit =
        Retrofit
            .Builder()
            .baseUrl(url)
            .client(client)
            .addConverterFactory(converterFactory)
            .addCallAdapterFactory(callAdapterFactory)
            .build()
}
