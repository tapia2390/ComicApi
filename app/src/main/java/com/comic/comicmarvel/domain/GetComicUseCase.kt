package com.comic.comicmarvel.domain

import com.comic.comicmarvel.data.model.ComicResponse
import com.comic.comicmarvel.data.model.repository.ComicRepository
import retrofit2.Response
import javax.inject.Inject

class GetComicUseCase @Inject constructor(private val repository: ComicRepository) {
    suspend operator fun invoke(): Response<ComicResponse> {
        val response = repository.getAllCommic()

        return  response
        /*return if(response.isSuccessful){
            response
        }else{
            repository.getAllDatabase()
        }*/
    }
}