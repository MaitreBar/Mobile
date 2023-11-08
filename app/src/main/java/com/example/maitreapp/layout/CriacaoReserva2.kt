package com.example.maitreapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.maitreapp.databinding.ActivityCriacaoReserva2Binding
import com.example.maitreapp.databinding.ActivityLoginBinding

class CriacaoReserva2 : AppCompatActivity() {
    val binding by lazy {
        ActivityCriacaoReserva2Binding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}