package com.example.maitreapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.maitreapp.databinding.ActivityCategoriasBinding
import com.example.maitreapp.databinding.ActivityLoginBinding

class Categorias : AppCompatActivity() {
    val binding by lazy {
        ActivityCategoriasBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}