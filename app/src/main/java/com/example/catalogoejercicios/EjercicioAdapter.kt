package com.example.catalogoejercicios

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EjercicioAdapter(
    private val listaEjercicios: List<Ejercicio>,
    private val onVerDetallesClick: (Ejercicio) -> Unit,
) : RecyclerView.Adapter<EjercicioAdapter.EjercicioViewHolder>() {

    class EjercicioViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgEjercicio: ImageView = itemView.findViewById(R.id.imgEjercicio)
        val txtNombreEjercicio: TextView = itemView.findViewById(R.id.txtNombreEjercicio)
        val txtGrupoMuscular: TextView = itemView.findViewById(R.id.txtGrupoMuscular)
        val btnVerDetalles: Button = itemView.findViewById(R.id.btnVerDetalles)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EjercicioViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_ejercicio, parent, false)
        return EjercicioViewHolder(view)
    }

    override fun onBindViewHolder(holder: EjercicioViewHolder, position: Int) {
        val ejercicio = listaEjercicios[position]
        val context = holder.itemView.context

        holder.txtNombreEjercicio.text = ejercicio.nombre
        holder.txtGrupoMuscular.text = context.getString(R.string.formato_grupo_item, ejercicio.grupoMuscular)
        holder.imgEjercicio.setImageResource(ejercicio.imagen)

        holder.btnVerDetalles.setOnClickListener {
            onVerDetallesClick(ejercicio)
        }

        // Permitir clic en toda la tarjeta para mejor experiencia de usuario
        holder.itemView.setOnClickListener {
            onVerDetallesClick(ejercicio)
        }
    }

    override fun getItemCount(): Int = listaEjercicios.size
}
