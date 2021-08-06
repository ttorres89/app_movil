package com.example.comparaprecios_tania.View

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.activity.viewModels
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import com.example.comparaprecios_tania.Model.ProductoModel
import com.example.comparaprecios_tania.Model.ProductoProvider
import com.example.comparaprecios_tania.R
import com.example.comparaprecios_tania.ViewModel.ProductoViewModel
import com.google.android.material.snackbar.Snackbar.make
import java.util.*
import kotlin.collections.ArrayList

class CustomAdapter (private val listaProducto:ArrayList<ProductoModel>): RecyclerView.Adapter<CustomAdapter.ViewHolder>(), Filterable, View.OnClickListener {


    private lateinit var  listener: View.OnClickListener
    //val listaProducto = ProductoProvider.productos
    //val maiList = listaProducto
    val listSearch = listaProducto


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
        v.setOnClickListener(this)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text = listaProducto[i].nombre
        viewHolder.itemDetail.text = listaProducto[i].marca
        viewHolder.itemImage.setImageResource(listaProducto[i].image)



    }

    override fun getItemCount(): Int {
        return listaProducto.size
    }

    override fun getFilter(): Filter {
        return object : Filter() {

            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val filteredList = ArrayList<ProductoModel>()

                if(constraint.isNullOrBlank() or constraint.isNullOrEmpty()){
                    filteredList.addAll(listaProducto)
                }else{
                    val filterPattern = constraint.toString().lowercase(Locale.ROOT).trim()

                    listSearch.forEach{
                        if(it.nombre?.lowercase(Locale.ROOT)?.contains(filterPattern) == true){
                            filteredList.add(it)
                        }
                    }

                }

                val result = FilterResults()
                result.values = filteredList
                return result

            }

            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                /*listSearch.clear()
                listSearch.addAll(results!!.values as ArrayList<ProductoModel>)
                notifyDataSetChanged()*/

                 if (results?.values == null){
                     listSearch.clear()
                    listSearch.addAll(listaProducto)
                     }
                 else{
                     listSearch.clear()
                    listSearch.addAll(results!!.values as ArrayList<ProductoModel>)}

                notifyDataSetChanged()

            }

        }
    }

    fun setOnClickListener(listener: View.OnClickListener){
        this.listener = listener
    }

    override fun onClick(v: View?) {
        if (listener!=null){
            listener.onClick(v)
        }
    }


}