package com.curiousapps.mypoke.data.remote.responses


import com.google.gson.annotations.SerializedName
data class GenerationIX(
    @SerializedName("red-blue")
    val redBlue: RedBlue,
    @SerializedName("red-green-japan")
    val redGreenJapan: RedGreenJapan,
    val yellow: Yellow
)
