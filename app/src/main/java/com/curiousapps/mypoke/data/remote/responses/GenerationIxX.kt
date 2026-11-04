package com.curiousapps.mypoke.data.remote.responses


import com.google.gson.annotations.SerializedName
data class GenerationIxX(
    val champions: Champions,
    @SerializedName("legends-za")
    val legendsZa: LegendsZa,
    @SerializedName("scarlet-violet")
    val scarletViolet: ScarletViolet
)
