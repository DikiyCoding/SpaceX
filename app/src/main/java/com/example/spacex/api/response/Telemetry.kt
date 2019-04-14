package com.example.spacex.api.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Telemetry {

    @SerializedName("flight_club")
    @Expose
    var flightClub: Any? = null

}
