package com.curiousapps.mypoke.data.remote.responses

import com.google.gson.annotations.SerializedName

data class Yellow(
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_gbc")
    val backGbc: String,
    @SerializedName("back_gray")
    val backGray: String,
    @SerializedName("back_transparent")
    val backTransparent: String,
    @SerializedName("back_transparent_gray")
    val backTransparentGray: String,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_gbc")
    val frontGbc: String,
    @SerializedName("front_gray")
    val frontGray: String,
    @SerializedName("front_transparent")
    val frontTransparent: String,
    @SerializedName("front_transparent_gray")
    val frontTransparentGray: String
)
