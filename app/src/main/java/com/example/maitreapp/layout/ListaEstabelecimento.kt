package com.example.maitreapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.maitreapp.databinding.ActivityListaEstabelecimentoBinding

class ListaEstabelecimento : AppCompatActivity() {
    val binding by lazy {
        ActivityListaEstabelecimentoBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}