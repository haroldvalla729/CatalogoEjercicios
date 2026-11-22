package com.example.catalogoejercicios

import java.io.Serializable

data class Ejercicio(
    val nombre: String,
    val grupoMuscular: String,
    val series: Int,
    val repeticiones: Int,
    val descripcion: String,
    val indicaciones: String,
    val imagen: Int,
) : Serializable
