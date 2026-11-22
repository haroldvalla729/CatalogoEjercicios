package com.example.catalogoejercicios

data class Ejercicio(
    val nombre: String,
    val grupoMuscular: String,
    val series: Int,
    val repeticiones: Int,
    val descripcion: String,
    val indicaciones: String,
    val imagen: Int
)