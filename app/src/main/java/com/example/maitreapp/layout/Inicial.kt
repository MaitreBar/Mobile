package com.example.maitreapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.maitreapp.databinding.ActivityInicialBinding
import com.example.maitreapp.databinding.ActivityLoginBinding

class Inicial : AppCompatActivity() {
    val binding by lazy {
        ActivityInicialBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}