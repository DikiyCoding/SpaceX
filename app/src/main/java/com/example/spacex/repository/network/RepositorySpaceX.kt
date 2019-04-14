package com.example.spacex.repository.network

import com.example.spacex.api.response.Launch
import com.example.spacex.api.service.SpaceXService
import com.example.spacex.utils.app.subscribeSingleOnIoObserveOnUi
import io.reactivex.Single

class RepositorySpaceX(private val spaceX: SpaceXService) {

    //TODO ApiKeyInterceptor
    fun getLaunches(limit: Int, offset: Int): Single<List<Launch>> =
        spaceX
            .getLaunches(limit = limit, offset = offset)
            .subscribeSingleOnIoObserveOnUi()
}
