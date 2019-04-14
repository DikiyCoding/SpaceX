package com.example.spacex.api.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Links {

    @SerializedName("mission_patch")
    @Expose
    var missionPatch: String? = null
    @SerializedName("mission_patch_small")
    @Expose
    var missionPatchSmall: String? = null
    @SerializedName("reddit_campaign")
    @Expose
    var redditCampaign: Any? = null
    @SerializedName("reddit_launch")
    @Expose
    var redditLaunch: Any? = null
    @SerializedName("reddit_recovery")
    @Expose
    var redditRecovery: Any? = null
    @SerializedName("reddit_media")
    @Expose
    var redditMedia: Any? = null
    @SerializedName("presskit")
    @Expose
    var presskit: Any? = null
    @SerializedName("article_link")
    @Expose
    var articleLink: String? = null
    @SerializedName("wikipedia")
    @Expose
    var wikipedia: String? = null
    @SerializedName("video_link")
    @Expose
    var videoLink: String? = null
    @SerializedName("youtube_id")
    @Expose
    var youtubeId: String? = null
    @SerializedName("flickr_images")
    @Expose
    var flickrImages: List<Any>? = null

}
