package com.example.spacex.api.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class OrbitParams {

    @SerializedName("reference_system")
    @Expose
    var referenceSystem: String? = null
    @SerializedName("regime")
    @Expose
    var regime: String? = null
    @SerializedName("longitude")
    @Expose
    var longitude: Any? = null
    @SerializedName("semi_major_axis_km")
    @Expose
    var semiMajorAxisKm: Any? = null
    @SerializedName("eccentricity")
    @Expose
    var eccentricity: Any? = null
    @SerializedName("periapsis_km")
    @Expose
    var periapsisKm: Any? = null
    @SerializedName("apoapsis_km")
    @Expose
    var apoapsisKm: Any? = null
    @SerializedName("inclination_deg")
    @Expose
    var inclinationDeg: Any? = null
    @SerializedName("period_min")
    @Expose
    var periodMin: Any? = null
    @SerializedName("lifespan_years")
    @Expose
    var lifespanYears: Any? = null
    @SerializedName("epoch")
    @Expose
    var epoch: Any? = null
    @SerializedName("mean_motion")
    @Expose
    var meanMotion: Any? = null
    @SerializedName("raan")
    @Expose
    var raan: Any? = null
    @SerializedName("arg_of_pericenter")
    @Expose
    var argOfPericenter: Any? = null
    @SerializedName("mean_anomaly")
    @Expose
    var meanAnomaly: Any? = null

}
