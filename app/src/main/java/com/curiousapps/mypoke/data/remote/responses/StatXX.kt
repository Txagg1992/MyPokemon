package com.curiousapps.mypoke.data.remote.responses

import com.google.gson.annotations.SerializedName

data class StatXX(
    @SerializedName("base_stat")
    val baseStat: Int,
    val effort: Int,
    val stat: StatX
)
