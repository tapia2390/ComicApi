package com.comic.comicmarvel.conexionRetrofit

import com.comic.comicmarvel.model.ComicResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET(Constants.END_POINT)
    suspend fun getComics(
        @Query("ts") ts: String,
        @Query("apikey") apikey: String,
        @Query("hash") hash: String
    ):Response<ComicResponse>


}