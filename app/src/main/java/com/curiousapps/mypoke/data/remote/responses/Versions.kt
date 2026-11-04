package com.curiousapps.mypoke.data.remote.responses


import com.google.gson.annotations.SerializedName
data class Versions(
    @SerializedName("generation-i")
    val generationI: GenerationI,
    @SerializedName("generation-ii")
    val generationIi: GenerationIi
)
