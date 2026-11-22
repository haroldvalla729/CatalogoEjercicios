package com.example.catalogoejercicios

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class DetalleEjercicioActivity : AppCompatActivity() {

    private lateinit var ivDetalleImagen: ImageView
    private lateinit var tvDetalleNombre: TextView
    private lateinit var tvDetalleGrupoMuscular: TextView
    private lateinit var tvDetalleSeries: TextView
    private lateinit var tvDetalleRepeticiones: TextView
    private lateinit var tvDetalleDescripcion: TextView
    private lateinit var tvDetalleIndicaciones: TextView
    private lateinit var btnRegresarAlCatalogo: MaterialButton
    private lateinit var btnHeaderBack: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detalle_ejercicio)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.detalle_main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        inicializarVistas()
        cargarDatosIntent()
        configurarEventos()
    }

    private fun inicializarVistas() {
        ivDetalleImagen = findViewById(R.id.ivDetalleImagen)
        tvDetalleNombre = findViewById(R.id.tvDetalleNombre)
        tvDetalleGrupoMuscular = findViewById(R.id.tvDetalleGrupoMuscular)
        tvDetalleSeries = findViewById(R.id.tvDetalleSeries)
        tvDetalleRepeticiones = findViewById(R.id.tvDetalleRepeticiones)
        tvDetalleDescripcion = findViewById(R.id.tvDetalleDescripcion)
        tvDetalleIndicaciones = findViewById(R.id.tvDetalleIndicaciones)
        btnRegresarAlCatalogo = findViewById(R.id.btnRegresarAlCatalogo)
        btnHeaderBack = findViewById(R.id.btnHeaderBack)
    }

    private fun cargarDatosIntent() {
        // Recuperación de los datos enviados a través del Intent
        val nombre = intent.getStringExtra("nombre") ?: ""
        val grupoMuscular = intent.getStringExtra("grupoMuscular") ?: ""
        val series = intent.getIntExtra("series", 0)
        val repeticiones = intent.getIntExtra("repeticiones", 0)
        val descripcion = intent.getStringExtra("descripcion") ?: ""
        val indicaciones = intent.getStringExtra("indicaciones") ?: ""
        val imagen = intent.getIntExtra("imagen", 0)

        // Asignación de los datos a los componentes gráficos
        tvDetalleNombre.text = nombre
        tvDetalleGrupoMuscular.text = getString(R.string.formato_grupo_detalle, grupoMuscular)
        tvDetalleSeries.text = getString(R.string.formato_series_detalle, series)
        tvDetalleRepeticiones.text = getString(R.string.formato_repeticiones_detalle, repeticiones)
        tvDetalleDescripcion.text = descripcion
        tvDetalleIndicaciones.text = indicaciones

        if (imagen != 0) {
            ivDetalleImagen.setImageResource(imagen)
        }
    }

    private fun configurarEventos() {
        // Botón principal de retorno
        btnRegresarAlCatalogo.setOnClickListener {
            finish()
        }

        // Flecha de retorno en el encabezado
        btnHeaderBack.setOnClickListener {
            finish()
        }
    }
}
