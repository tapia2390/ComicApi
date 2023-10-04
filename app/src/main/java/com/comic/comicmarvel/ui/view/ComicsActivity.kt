package com.comic.comicmarvel.ui.view

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.comic.comicmarvel.R
import com.comic.comicmarvel.databinding.ActivityComicsBinding
import com.comic.comicmarvel.ui.fragment.ComicFragment
import com.comic.comicmarvel.ui.viewmodel.ComicsViewModel


class ComicsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityComicsBinding
    private   val comicViewModel: ComicsViewModel by  viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComicsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val fragment =ComicFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()

/*
        comicViewModel.onCreate()

        comicViewModel.comicModel.observe(this, Observer {
           Log.v("data", it.toString())

        })*/

    }


}