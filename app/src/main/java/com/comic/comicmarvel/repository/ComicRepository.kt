package com.comic.comicmarvel.repository


import com.comic.comicmarvel.conexionRetrofit.ApiService
import com.comic.comicmarvel.conexionRetrofit.Constants
import javax.inject.Inject

class ComicRepository
@Inject
constructor(private val apiService: ApiService) {
    suspend fun getComics() = apiService.getComics(Constants.ts,Constants.apikey,Constants.hash)
}