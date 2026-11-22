package com.example.catalogoejercicios

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EjercicioAdapter(
    private val ejercicios: List<Ejercicio>,
    private val onVerDetalles: (Ejercicio) -> Unit
) : RecyclerView.Adapter<EjercicioAdapter.EjercicioViewHolder>() {

    // ViewHolder
    class EjercicioViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        val imagen: ImageView =
            itemView.findViewById(R.id.imgEjercicio)

        val nombre: TextView =
            itemView.findViewById(R.id.txtNombreEjercicio)

        val grupoMuscular: TextView =
            itemView.findViewById(R.id.txtGrupoMuscular)

        val botonDetalles: View =
            itemView.findViewById(R.id.btnVerDetalles)
    }

    // Crear cada elemento de la lista
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): EjercicioViewHolder {

        val vista = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_ejercicio, parent, false)

        return EjercicioViewHolder(vista)
    }

    // Asignar los datos
    override fun onBindViewHolder(
        holder: EjercicioViewHolder,
        position: Int
    ) {
        val ejercicio = ejercicios[position]

        holder.nombre.text = ejercicio.nombre
        holder.grupoMuscular.text = ejercicio.grupoMuscular
        holder.imagen.setImageResource(ejercicio.imagen)

        holder.botonDetalles.setOnClickListener {
            onVerDetalles(ejercicio)
        }
    }

    // Cantidad de elementos
    override fun getItemCount(): Int {
        return ejercicios.size
    }
}