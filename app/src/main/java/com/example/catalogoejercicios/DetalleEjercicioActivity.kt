package com.example.catalogoejercicios

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetalleEjercicioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_detalle_ejercicio)

        // Obtener los datos enviados
        val nombre = intent.getStringExtra("nombre") ?: ""
        val grupo = intent.getStringExtra("grupoMuscular") ?: ""
        val series = intent.getStringExtra("series") ?: ""
        val repeticiones = intent.getStringExtra("repeticiones") ?: ""
        val descripcion = intent.getStringExtra("descripcion") ?: ""
        val indicaciones = intent.getStringExtra("indicaciones") ?: ""
        val imagen = intent.getIntExtra("imagen", 0)

        // Referencias a los componentes
        val imgDetalle = findViewById<ImageView>(
            R.id.imgDetalleEjercicio
        )

        val txtNombre = findViewById<TextView>(
            R.id.txtDetalleNombre
        )

        val txtGrupo = findViewById<TextView>(
            R.id.txtDetalleGrupo
        )

        val txtSeries = findViewById<TextView>(
            R.id.txtDetalleSeries
        )

        val txtDescripcion = findViewById<TextView>(
            R.id.txtDetalleDescripcion
        )

        val txtIndicaciones = findViewById<TextView>(
            R.id.txtDetalleIndicaciones
        )

        val btnRegresar = findViewById<Button>(
            R.id.btnRegresar
        )

        // Mostrar la información
        txtNombre.text = nombre
        txtGrupo.text = "Grupo muscular: $grupo"
        txtSeries.text = "$series series × $repeticiones repeticiones"
        txtDescripcion.text = descripcion
        txtIndicaciones.text = indicaciones

        if (imagen != 0) {
            imgDetalle.setImageResource(imagen)
        }

        // Regresar a la pantalla anterior
        btnRegresar.setOnClickListener {
            finish()
        }
    }
}