package com.example.spacex.model

import android.arch.paging.PagedList
import com.example.spacex.api.response.Launch

class LaunchesModel(val pagedList: PagedList<Launch>)