package com.comic.comicmarvel.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.comic.comicmarvel.model.ComicData
import com.comic.comicmarvel.model.ComicResult
import com.comic.comicmarvel.repository.ComicRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class ComitViewModel
@Inject
constructor(private val repository: ComicRepository) : ViewModel() {

    private val _response = MutableLiveData<List<ComicResult>>()
    val responseCoic: LiveData<List<ComicResult>>
        get() = _response

    init {
        getAllComics()
    }

    private fun getAllComics() = viewModelScope.launch {
        repository.getComics().let {response ->

            if (response.isSuccessful){
                Log.v("data",response.body().toString())
               //_response.postValue(response.body())
            }else{
                Log.d("tag", "getAllTvShows Error: ${response.code()}")
            }
        }
    }



}

