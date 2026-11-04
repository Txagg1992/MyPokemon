package com.curiousapps.mypoke.data.remote.responses


import com.google.gson.annotations.SerializedName
data class GenerationIi(
    @SerializedName("gold-and-silver")
    val goldAndSilver: GoldAndSilver
)
