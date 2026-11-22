package com.example.catalogoejercicios

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerEjercicios)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = EjercicioAdapter(
            DatosEjercicios.listaEjercicios
        ) { ejercicio ->
            abrirDetalles(ejercicio)
        }
        recyclerView.adapter = adapter
    }
    private fun abrirDetalles(ejercicio: Ejercicio) {

        val intent = Intent(
            this,
            DetalleEjercicioActivity::class.java
        )

        intent.putExtra("nombre", ejercicio.nombre)
        intent.putExtra("grupoMuscular", ejercicio.grupoMuscular)
        intent.putExtra("series", ejercicio.series.toString())
        intent.putExtra("repeticiones", ejercicio.repeticiones.toString())
        intent.putExtra("descripcion", ejercicio.descripcion)
        intent.putExtra("indicaciones", ejercicio.indicaciones)
        intent.putExtra("imagen", ejercicio.imagen)

        startActivity(intent)
    }
}