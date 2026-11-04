package com.curiousapps.mypoke.data.remote.responses

import com.google.gson.annotations.SerializedName

data class IconsXX(
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_shiny")
    val frontShiny: String
)
