package com.example.spacex.utils.paged_list

import android.support.v7.util.DiffUtil
import com.example.spacex.api.response.Launch

class LaunchesDiffUtil : DiffUtil.ItemCallback<Launch>() {

    override fun areItemsTheSame(
        itemOld: Launch,
        itemNew: Launch
    ): Boolean = itemOld.isSame(itemNew)

    override fun areContentsTheSame(
        itemOld: Launch,
        itemNew: Launch
    ): Boolean = itemOld.isSame(itemNew)
}
