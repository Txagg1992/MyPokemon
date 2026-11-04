package com.curiousapps.mypoke.data.remote.responses


import com.google.gson.annotations.SerializedName
data class GenerationIii(
    val emerald: Emerald,
    @SerializedName("firered-leafgreen")
    val fireredLeafgreen: FireredLeafgreen,
    val icons: Icons,
    @SerializedName("ruby-sapphire")
    val rubySapphire: RubySapphire
)
