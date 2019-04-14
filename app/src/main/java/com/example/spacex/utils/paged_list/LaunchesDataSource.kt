package com.example.spacex.utils.paged_list

import android.arch.paging.PositionalDataSource
import android.util.Log
import com.example.spacex.api.response.Launch
import com.example.spacex.repository.network.RepositorySpaceX
import io.reactivex.rxkotlin.subscribeBy

class LaunchesDataSource(private val repository: RepositorySpaceX) : PositionalDataSource<Launch>() {

    override fun loadInitial(params: LoadInitialParams, callback: LoadInitialCallback<Launch>) {
        Log.d("Logs", "loadInitial, requestedStartPosition = "
                + params.requestedStartPosition + ", requestedLoadSize = " + params.requestedLoadSize)
        repository.getLaunches(
            params.requestedStartPosition,
            params.requestedLoadSize).subscribeBy(onSuccess = {callback.onResult(it, 0)})
    }

    override fun loadRange(params: LoadRangeParams, callback: LoadRangeCallback<Launch>) {
        Log.d("Logs", "loadRange, startPosition = "
                + params.startPosition + ", loadSize = " + params.loadSize)
        repository.getLaunches(
            params.startPosition,
            params.loadSize).subscribeBy(onSuccess = {callback.onResult(it)})
    }
}
