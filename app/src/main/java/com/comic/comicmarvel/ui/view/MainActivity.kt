package com.comic.comicmarvel.ui.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import com.comic.comicmarvel.R
import com.comic.comicmarvel.databinding.ActivityMainBinding

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
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val animation = AnimationUtils.loadAnimation(this, R.anim.scale_animation)
        binding.imgLogo.startAnimation(animation)

        val delayMillis = 2000L // Tiempo en milisegundos
        Handler().postDelayed({

            val intent = Intent(this, ComicsActivity::class.java)
            startActivity(intent)
            finish()

        }, delayMillis)



    }
}