package com.example.spacex.api.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Timeline {

    @SerializedName("webcast_liftoff")
    @Expose
    var webcastLiftoff: Int? = null

}
