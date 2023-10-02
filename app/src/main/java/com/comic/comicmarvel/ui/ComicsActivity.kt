package com.comic.comicmarvel.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.comic.comicmarvel.databinding.ActivityComicsBinding
import com.comic.comicmarvel.model.ComicResult
import com.comic.comicmarvel.viewmodel.ComitViewModel

class ComicsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityComicsBinding

    private val viewModel: ComitViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComicsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        getComic()
    }

    private fun getComic() {
        viewModel.responseCoic.observe(this) { listComics ->

            var comics: List<ComicResult> = listComics

        }

    }
}