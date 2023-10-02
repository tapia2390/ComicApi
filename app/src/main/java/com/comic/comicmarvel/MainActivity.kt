package com.comic.comicmarvel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.activity.viewModels
import com.comic.comicmarvel.databinding.ActivityMainBinding
import com.comic.comicmarvel.fragment.comic.ComicViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Solicitar que la actividad no tenga título
        requestWindowFeature(Window.FEATURE_NO_TITLE)

// Configurar la actividad en modo de pantalla completa
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        setContentView(R.layout.activity_main)
    }
}