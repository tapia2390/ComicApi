package com.comic.comicmarvel.data.model

import com.google.gson.annotations.SerializedName

data class ComicResponse (
    @SerializedName("code")
    val code: Int,
    @SerializedName("status")
    val status:String,
    @SerializedName("data")
    val data: ComicData
)