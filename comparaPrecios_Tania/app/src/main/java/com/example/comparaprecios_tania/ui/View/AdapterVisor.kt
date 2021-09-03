package com.example.comparaprecios_tania.ui.View

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import com.example.comparaprecios_tania.data.Model.Producto_detalle
import com.example.comparaprecios_tania.R
import com.squareup.picasso.Picasso

class AdapterVisor (private val listaProducto:List<Producto_detalle>, private val context: Context): RecyclerView.Adapter<AdapterVisor.ViewHolder>(){


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
        viewHolder.itemTitle.text = "$" + listaProducto[i].precio.toString()
        viewHolder.itemDetail.text = listaProducto[i].fuente.nombre
        //viewHolder.itemImage.setImageResource(listaProducto[i].fuente.imagen)
        Picasso.with(context).load(listaProducto[i].fuente.imagen).placeholder(R.drawable.placeholder).error(R.drawable.error).fit().centerInside().noFade().into(viewHolder.itemImage);
    }

    override fun getItemCount(): Int {
        return listaProducto.size
    }
}