package com.comic.comicmarvel.core

import com.comic.comicmarvel.data.model.ComicResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ResponseService  @Inject constructor(private val api:ApiService) {


    suspend fun getComit(): ComicResponse {
        return withContext(Dispatchers.IO) {
            val response = api.getComics(Constants.ts,Constants.apikey,Constants.hash)
            response.body()!!
        }
    }

}