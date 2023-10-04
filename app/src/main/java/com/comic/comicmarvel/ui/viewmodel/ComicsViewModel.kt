package com.comic.comicmarvel.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.comic.comicmarvel.data.model.ComicResponse
import com.comic.comicmarvel.domain.GetComicUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ComicsViewModel @Inject constructor(
    private val getComicUseCase: GetComicUseCase
) : ViewModel() {

    val comicModel = MutableLiveData<ComicResponse>()
    val isLoading = MutableLiveData<Boolean>()

    fun onCreate() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getComicUseCase()

            if (!result.isSuccessful) {
                comicModel.postValue(result.body())
                isLoading.postValue(false)
            }
        }
    }

}