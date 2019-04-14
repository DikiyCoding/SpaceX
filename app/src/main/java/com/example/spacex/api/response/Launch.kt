package com.example.spacex.api.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Launch {

    @SerializedName("flight_number")
    @Expose
    var flightNumber: Int? = null
    @SerializedName("mission_name")
    @Expose
    var missionName: String? = null
    @SerializedName("mission_id")
    @Expose
    var missionId: List<Any>? = null
    @SerializedName("upcoming")
    @Expose
    var upcoming: Boolean? = null
    @SerializedName("launch_year")
    @Expose
    var launchYear: String? = null
    @SerializedName("launch_date_unix")
    @Expose
    var launchDateUnix: Int? = null
    @SerializedName("launch_date_utc")
    @Expose
    var launchDateUtc: String? = null
    @SerializedName("launch_date_local")
    @Expose
    var launchDateLocal: String? = null
    @SerializedName("is_tentative")
    @Expose
    var isTentative: Boolean? = null
    @SerializedName("tentative_max_precision")
    @Expose
    var tentativeMaxPrecision: String? = null
    @SerializedName("tbd")
    @Expose
    var tbd: Boolean? = null
    @SerializedName("launch_window")
    @Expose
    var launchWindow: Int? = null
    @SerializedName("rocket")
    @Expose
    var rocket: Rocket? = null
    @SerializedName("ships")
    @Expose
    var ships: List<Any>? = null
    @SerializedName("telemetry")
    @Expose
    var telemetry: Telemetry? = null
    @SerializedName("launch_site")
    @Expose
    var launchSite: LaunchSite? = null
    @SerializedName("launch_success")
    @Expose
    var launchSuccess: Boolean? = null
    @SerializedName("launch_failure_details")
    @Expose
    var launchFailureDetails: LaunchFailureDetails? = null
    @SerializedName("links")
    @Expose
    var links: Links? = null
    @SerializedName("details")
    @Expose
    var details: String? = null
    @SerializedName("static_fire_date_utc")
    @Expose
    var staticFireDateUtc: Any? = null
    @SerializedName("static_fire_date_unix")
    @Expose
    var staticFireDateUnix: Any? = null
    @SerializedName("timeline")
    @Expose
    var timeline: Timeline? = null

    fun isSame(other: Launch): Boolean =
        other.flightNumber == flightNumber
}
