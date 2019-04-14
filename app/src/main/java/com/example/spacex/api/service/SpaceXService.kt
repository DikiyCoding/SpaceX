package com.example.spacex.api.service

import com.example.spacex.api.response.Launch
import com.example.spacex.utils.app.Constants
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface SpaceXService {

    @GET(Constants.SPACEX_LAUNCHES)
    fun getLaunches(
        @Query("limit") limit: Int,
        @Query("offset") offset: Int
    ): Single<List<Launch>>
}
