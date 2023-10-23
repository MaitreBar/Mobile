package com.example.maitreapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.maitreapp.databinding.ActivityAlterarPerfilBinding
import com.example.maitreapp.databinding.ActivityLoginBinding

class AlterarPerfil : AppCompatActivity() {
    val binding by lazy {
        ActivityAlterarPerfilBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alterar_perfil)
    }
}