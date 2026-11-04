package com.curiousapps.mypoke.data.remote.responses

import com.google.gson.annotations.SerializedName

data class LegendsZa(
    @SerializedName("back_default")
    val backDefault: Any,
    @SerializedName("back_female")
    val backFemale: Any,
    @SerializedName("back_shiny")
    val backShiny: Any,
    @SerializedName("back_shiny_female")
    val backShinyFemale: Any,
    @SerializedName("front_default")
    val frontDefault: Any,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: Any,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any,
    val icons: IconsXXX
)
