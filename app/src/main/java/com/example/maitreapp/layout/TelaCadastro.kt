package com.example.maitreapp

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.example.maitreapp.data.Usuario
import com.example.maitreapp.databinding.ActivityTelaCadastroBinding
import com.example.maitreapp.`interface`.Endpoint
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class TelaCadastro : AppCompatActivity() {
    val binding by lazy {
        ActivityTelaCadastroBinding.inflate(layoutInflater)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btCadastrar.setOnClickListener {
            val usuarioNovo = Usuario(
                binding.etCadastroNome.text.toString(),
                binding.etCadastroEmail.text.toString(),
                binding.etCadastroCpf.text.toString(),
                LocalDate.parse(binding.etCadastroDtNasc.text.toString(), DateTimeFormatter.ofPattern("dd/MM/yyyy")).toString(),
                binding.etCadastroCelular.text.toString(),
                binding.etCadastroRg.text.toString(),
                binding.etCadastroSenha.text.toString()
            )

            cadastrar(usuarioNovo)
        }
    }

    fun cadastrar(u : Usuario){
        val api = Retrofit.Builder()
            .baseUrl("http://44.213.7.88:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(Endpoint::class.java)

        api.cadastrar(u).enqueue(object : Callback<Usuario> {
            override fun onResponse(call: Call<Usuario>, response: Response<Usuario>) {
                if(response.isSuccessful) {
                    Toast.makeText(baseContext, "Cadastro realizado com sucesso", Toast.LENGTH_SHORT)
                    Toast.makeText(baseContext, "Redirecionando para tela de login", Toast.LENGTH_SHORT)
                    val intent = Intent(this@TelaCadastro, Login::class.java)

                    startActivity(intent)
                }
            }

            override fun onFailure(call: Call<Usuario>, t: Throwable) {
                Toast.makeText(baseContext, t.message, Toast.LENGTH_SHORT).show()
            }

        }
        )

    }
}