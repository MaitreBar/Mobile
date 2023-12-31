package com.example.maitreapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.maitreapp.databinding.ActivityLoginBinding
import com.example.maitreapp.databinding.ActivityReservasBinding

class Reservas : AppCompatActivity() {
    val binding by lazy {
        ActivityReservasBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}