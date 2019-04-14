package com.example.spacex.api.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Fairings {

    @SerializedName("reused")
    @Expose
    var reused: Boolean? = null
    @SerializedName("recovery_attempt")
    @Expose
    var recoveryAttempt: Boolean? = null
    @SerializedName("recovered")
    @Expose
    var recovered: Boolean? = null
    @SerializedName("ship")
    @Expose
    var ship: Any? = null

}
