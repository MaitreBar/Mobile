package com.example.maitreapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.maitreapp.databinding.ActivityEstabelecimentosMaisVisitadosBinding
import com.example.maitreapp.databinding.ActivityLoginBinding

class EstabelecimentosMaisVisitados : AppCompatActivity() {
    val binding by lazy {
        ActivityEstabelecimentosMaisVisitadosBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}