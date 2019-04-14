package com.example.spacex.api.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Rocket {

    @SerializedName("rocket_id")
    @Expose
    var rocketId: String? = null
    @SerializedName("rocket_name")
    @Expose
    var rocketName: String? = null
    @SerializedName("rocket_type")
    @Expose
    var rocketType: String? = null
    @SerializedName("first_stage")
    @Expose
    var firstStage: FirstStage? = null
    @SerializedName("second_stage")
    @Expose
    var secondStage: SecondStage? = null
    @SerializedName("fairings")
    @Expose
    var fairings: Fairings? = null

}
