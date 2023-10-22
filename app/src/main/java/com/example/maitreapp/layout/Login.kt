package com.example.maitreapp

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.maitreapp.data.Usuario
import com.example.maitreapp.databinding.ActivityLoginBinding
import com.example.maitreapp.`interface`.Endpoint
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.Optional

class Login : AppCompatActivity() {
    val binding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btLogar.setOnClickListener {
            getData()
        }
    }
    fun getData() {
        val api = Retrofit.Builder()
            .baseUrl("http://44.213.7.88:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(Endpoint::class.java)

        api.getLogin(binding.etEmail.text.toString(), binding.etSenha.text.toString()).enqueue(object : Callback<Optional<Usuario>> {
            override fun onResponse(
                call: Call<Optional<Usuario>>,
                response: Response<Optional<Usuario>>
            ) {
                if(response.isSuccessful){
                    Toast.makeText(baseContext, "deu certo", Toast.LENGTH_SHORT).show()
                    val inicial = Intent(this@Login, Inicial::class.java)
                    startActivity(inicial)
                }
            }

            override fun onFailure(call: Call<Optional<Usuario>>, t: Throwable) {
                Toast.makeText(baseContext, t.message, Toast.LENGTH_SHORT).show()
            }

        })
    }
}