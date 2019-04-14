package com.example.spacex.model

import android.arch.paging.PagedList
import com.example.spacex.api.response.Launch

class DetailsModel(private val pagedList: PagedList<Launch>) {
    fun getItem(position: Int): Launch? =
        pagedList[position]
}
