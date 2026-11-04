package com.curiousapps.mypoke.data.remote.responses


import com.google.gson.annotations.SerializedName
data class GenerationVi(
    val icons: IconsXXXX,
    @SerializedName("omega-ruby-alpha-sapphire")
    val omegaRubyAlphaSapphire: OmegaRubyAlphaSapphire,
    @SerializedName("x-y")
    val xY: XY
)
