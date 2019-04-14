package com.example.spacex.api.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Payload {

    @SerializedName("payload_id")
    @Expose
    var payloadId: String? = null
    @SerializedName("norad_id")
    @Expose
    var noradId: List<Any>? = null
    @SerializedName("reused")
    @Expose
    var reused: Boolean? = null
    @SerializedName("customers")
    @Expose
    var customers: List<String>? = null
    @SerializedName("nationality")
    @Expose
    var nationality: String? = null
    @SerializedName("manufacturer")
    @Expose
    var manufacturer: Any? = null
    @SerializedName("payload_type")
    @Expose
    var payloadType: String? = null
    @SerializedName("payload_mass_kg")
    @Expose
    var payloadMassKg: Any? = null
    @SerializedName("payload_mass_lbs")
    @Expose
    var payloadMassLbs: Any? = null
    @SerializedName("orbit")
    @Expose
    var orbit: String? = null
    @SerializedName("orbit_params")
    @Expose
    var orbitParams: OrbitParams? = null

}
