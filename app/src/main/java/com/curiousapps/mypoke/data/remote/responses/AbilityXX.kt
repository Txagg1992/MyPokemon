package com.curiousapps.mypoke.data.remote.responses

import com.google.gson.annotations.SerializedName

data class AbilityXX(
    val ability: Any,
    @SerializedName("is_hidden")
    val isHidden: Boolean,
    val slot: Int
)
