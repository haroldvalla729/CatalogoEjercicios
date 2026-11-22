package com.example.catalogoejercicios

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvEjercicios: RecyclerView
    private lateinit var ejercicioAdapter: EjercicioAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        rvEjercicios = findViewById(R.id.rvEjercicios)
        rvEjercicios.layoutManager = LinearLayoutManager(this)

        val listaEjercicios = DatosEjercicios.listaEjercicios

        ejercicioAdapter = EjercicioAdapter(listaEjercicios) { ejercicioSeleccionado ->
            navegarADetalle(ejercicioSeleccionado)
        }
        rvEjercicios.adapter = ejercicioAdapter
    }

    private fun navegarADetalle(ejercicio: Ejercicio) {
        val intent = Intent(this, DetalleEjercicioActivity::class.java).apply {
            putExtra("nombre", ejercicio.nombre)
            putExtra("grupoMuscular", ejercicio.grupoMuscular)
            putExtra("series", ejercicio.series)
            putExtra("repeticiones", ejercicio.repeticiones)
            putExtra("descripcion", ejercicio.descripcion)
            putExtra("indicaciones", ejercicio.indicaciones)
            putExtra("imagen", ejercicio.imagen)
        }
        startActivity(intent)
    }
}