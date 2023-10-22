package com.example.maitreapp.data

import com.example.maitreapp.Reservas

data class Estabelecimento(
    val idEstabelecimento: Integer,
    val nome: String,
    val senha: String,
    val logradouro: String,
    val numero: String,
    val complemento: String,
    val cep: String,
    val diasDaSemana: String,
    val faixaDePreco: String,
    val cnpj: String,
    val telefoneContato: String,
    val horarioAbertura: String,
    val horarioFechamento: String,
    val descricao: String,
    val email: String,
    val assentos: List<Assento>,
    val tags: String,
    val reservas: List<Reserva>
)
