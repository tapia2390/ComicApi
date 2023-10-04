package com.comic.comicmarvel.data.model

import com.google.gson.annotations.SerializedName

data class ComicData (
    @SerializedName("results")
    val comicResult: List<ComicResult>?
)