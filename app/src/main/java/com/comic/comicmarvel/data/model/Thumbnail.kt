package com.comic.comicmarvel.data.model

import com.google.gson.annotations.SerializedName

class Thumbnail(
    @SerializedName("path")
    val path: String,
    @SerializedName("extension")
    val extension: String,
)