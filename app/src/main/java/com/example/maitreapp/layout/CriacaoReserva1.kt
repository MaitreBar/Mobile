package com.example.maitreapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.maitreapp.databinding.ActivityCriacaoReserva1Binding
import com.example.maitreapp.databinding.ActivityLoginBinding

class CriacaoReserva1 : AppCompatActivity() {
    val binding by lazy {
        ActivityCriacaoReserva1Binding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}