package com.example.maitreapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.maitreapp.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {

    val binding by lazy {
        ActivityHomeBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btLogin.setOnClickListener {
            val login = Intent(this, Login::class.java)
            startActivity(login)
        }

        binding.btCadastro.setOnClickListener {
            val cadastro = Intent(this, TelaCadastro::class.java)
            startActivity(cadastro)
        }
    }
}