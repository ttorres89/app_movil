package com.example.comparaprecios_tania.View

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import com.example.comparaprecios_tania.Model.Producto_detalle
import com.example.comparaprecios_tania.R

class AdapterVisor (private val listaProducto:ArrayList<Producto_detalle>): RecyclerView.Adapter<AdapterVisor.ViewHolder>(){


    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView


        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)

        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text = listaProducto[i].precio.toString()
        viewHolder.itemDetail.text = listaProducto[i].fuente.nombre
        viewHolder.itemImage.setImageResource(listaProducto[i].fuente.imagen)
    }

    override fun getItemCount(): Int {
        return listaProducto.size
    }
}