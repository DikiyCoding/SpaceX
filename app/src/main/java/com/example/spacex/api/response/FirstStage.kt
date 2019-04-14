package com.example.spacex.api.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class FirstStage {

    @SerializedName("cores")
    @Expose
    var cores: List<Core>? = null

}
