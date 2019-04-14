package com.example.spacex.ui.adapters

import android.arch.paging.PagedListAdapter
import android.support.v7.util.DiffUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.spacex.R
import com.example.spacex.api.response.Launch
import com.example.spacex.utils.app.LaunchesAdapterCallback
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_launches.view.*

class LaunchesAdapter(
    diffUtilCallback: DiffUtil.ItemCallback<Launch>,
    private val callback: (LaunchesAdapterCallback) -> Unit
) :
    PagedListAdapter<Launch, LaunchesAdapter.ViewHolder>(diffUtilCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_launches, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val info = getItem(position)
        holder.tvMissionName.text = info?.missionName
        Picasso
            .get()
            .load(info?.links?.missionPatchSmall)
            .noFade()
            .into(holder.ivLaunchLogo)
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvMissionName: TextView = view.tv_item
        val ivLaunchLogo: ImageView = view.iv_item

        init {
            view.setOnClickListener {
                callback.invoke(
                    LaunchesAdapterCallback(adapterPosition, ivLaunchLogo)
                )
            }
        }
    }
}
