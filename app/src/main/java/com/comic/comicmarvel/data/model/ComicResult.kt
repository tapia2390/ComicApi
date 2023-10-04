package com.comic.comicmarvel.data.model

import com.google.gson.annotations.SerializedName

class ComicResult (
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title:String,
    @SerializedName("description")
    val description:String,

    @SerializedName("modified")
    val modified:String,


    @SerializedName("pageCount")
    val pageCount: Int,
    @SerializedName("thumbnail")
    val thumbnail : Thumbnail,
)