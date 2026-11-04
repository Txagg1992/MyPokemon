package com.curiousapps.mypoke.data.remote.responses


import com.google.gson.annotations.SerializedName
data class GenerationI(
    @SerializedName("red-and-blue")
    val redAndBlue: RedAndBlue,
    @SerializedName("red-and-green")
    val redAndGreen: RedAndGreen
)
