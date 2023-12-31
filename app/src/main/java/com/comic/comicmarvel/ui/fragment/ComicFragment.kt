package com.comic.comicmarvel.ui.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.comic.comicmarvel.R
import com.comic.comicmarvel.databinding.FragmentComicBinding

class ComicFragment : Fragment() {

    private lateinit var binding: FragmentComicBinding
    companion object {
        fun newInstance() = ComicFragment()
    }

    private lateinit var viewModel: ComicViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentComicBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(ComicViewModel::class.java)

        viewModel.text.observe(viewLifecycleOwner) {
            binding.hola.text = it
        }

        return binding.root
    }



}