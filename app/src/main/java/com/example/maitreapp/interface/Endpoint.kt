package com.example.maitreapp.`interface`

import com.example.maitreapp.data.Usuario
import retrofit2.Call
import retrofit2.http.GET
import java.util.Optional

interface Endpoint {
    @GET("usuarios/")
    fun getUsuarios() : Call<List<Usuario>>

    @GET("usuarios/{email}/{senha}")
    fun getLogin(email: String, senha: String) : Call<Optional<Usuario>>
}