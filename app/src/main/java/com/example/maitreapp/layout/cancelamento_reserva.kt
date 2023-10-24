package com.example.maitreapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.maitreapp.databinding.ActivityCancelamentoReservaBinding
import com.example.maitreapp.databinding.ActivityLoginBinding

class cancelamento_reserva : AppCompatActivity() {
    val binding by lazy {
        ActivityCancelamentoReservaBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}