package com.comic.comicmarvel.model

data class ComicResponse (
    val code: Int,
    val status:String,
    val name: String,
    val data: ComicData
)