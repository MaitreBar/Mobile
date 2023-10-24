package com.example.maitreapp.data

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

data class Reserva(
    val dtReserva: LocalDate,
    val horaReserva:LocalTime,
    val checkin: Boolean,
    val dtHoraCheckIn: LocalDateTime,
    val checkout: Boolean,
    val dtHoraCheckOut: LocalDateTime,
    val feedback: String,
    val estabelecimento: Estabelecimento,
    val usuario: Usuario,
    val assentos: List<Assento>
)
