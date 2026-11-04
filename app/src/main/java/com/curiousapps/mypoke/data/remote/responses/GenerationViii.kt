package com.curiousapps.mypoke.data.remote.responses


import com.google.gson.annotations.SerializedName
data class GenerationViii(
    @SerializedName("brilliant-diamond-shining-pearl")
    val brilliantDiamondShiningPearl: BrilliantDiamondShiningPearl,
    @SerializedName("legends-arceus")
    val legendsArceus: LegendsArceus,
    @SerializedName("sword-shield")
    val swordShield: SwordShield
)
