package com.example.maitreapp.layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.maitreapp.Home
import com.example.maitreapp.Login
import com.example.maitreapp.R

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            val intent = Intent(this@SplashScreen, Home::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}