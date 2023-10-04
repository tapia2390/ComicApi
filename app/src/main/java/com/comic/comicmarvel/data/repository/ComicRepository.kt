package com.comic.comicmarvel.data.model.repository


import com.comic.comicmarvel.core.ApiService
import com.comic.comicmarvel.core.Constants
import com.comic.comicmarvel.data.model.ComicResponse
import retrofit2.Response
import javax.inject.Inject

class ComicRepository @Inject constructor(
    private val api: ApiService,
) {

    suspend fun getAllCommic(): Response<ComicResponse> {
        val response: Response<ComicResponse> = api.getComics(Constants.ts,Constants.apikey,Constants.hash)
        return response
    }
}