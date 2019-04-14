package com.example.spacex.api.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Core {

    @SerializedName("core_serial")
    @Expose
    var coreSerial: String? = null
    @SerializedName("flight")
    @Expose
    var flight: Int? = null
    @SerializedName("block")
    @Expose
    var block: Any? = null
    @SerializedName("gridfins")
    @Expose
    var gridfins: Boolean? = null
    @SerializedName("legs")
    @Expose
    var legs: Boolean? = null
    @SerializedName("reused")
    @Expose
    var reused: Boolean? = null
    @SerializedName("land_success")
    @Expose
    var landSuccess: Any? = null
    @SerializedName("landing_intent")
    @Expose
    var landingIntent: Boolean? = null
    @SerializedName("landing_type")
    @Expose
    var landingType: Any? = null
    @SerializedName("landing_vehicle")
    @Expose
    var landingVehicle: Any? = null

}
