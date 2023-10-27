package com.example.maitreapp.data

import java.time.LocalDate

data class Usuario(
    val idUsuario: Integer?,
    val nome: String,
    val email: String,
    val cpf: String,
    val dtNasc: LocalDate,
    val celular: String,
    val rg: String,
    val senha: String
    )
