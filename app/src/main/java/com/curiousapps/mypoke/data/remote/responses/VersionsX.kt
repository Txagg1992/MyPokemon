package com.curiousapps.mypoke.data.remote.responses


import com.google.gson.annotations.SerializedName
data class VersionsX(
    @SerializedName("generation-i")
    val generationI: GenerationIX,
    @SerializedName("generation-ii")
    val generationIi: GenerationIiX,
    @SerializedName("generation-iii")
    val generationIii: GenerationIii,
    @SerializedName("generation-iv")
    val generationIv: GenerationIv,
    @SerializedName("generation-ix")
    val generationIx: GenerationIxX,
    @SerializedName("generation-v")
    val generationV: GenerationV,
    @SerializedName("generation-vi")
    val generationVi: GenerationVi,
    @SerializedName("generation-vii")
    val generationVii: GenerationVii,
    @SerializedName("generation-viii")
    val generationViii: GenerationViii
)
