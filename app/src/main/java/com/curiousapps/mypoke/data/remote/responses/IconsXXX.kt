package com.curiousapps.mypoke.data.remote.responses

import com.google.gson.annotations.SerializedName

data class IconsXXX(
    @SerializedName("front_default")
    val frontDefault: Any,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: Any,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any
)
