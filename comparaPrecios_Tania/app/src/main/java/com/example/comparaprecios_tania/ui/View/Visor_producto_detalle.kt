package com.example.comparaprecios_tania.ui.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.comparaprecios_tania.data.Model.Producto_detalle
import com.example.comparaprecios_tania.R
import com.example.comparaprecios_tania.ui.ViewModel.ProductoViewModel
import com.squareup.picasso.Picasso

class Visor_producto_detalle : AppCompatActivity() {

    private lateinit var productoViewModel:ProductoViewModel
    var lista_producto_detalle = MutableLiveData<List<Producto_detalle>>()
    lateinit var nombre:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visor_producto_detalle)

        nombre = intent.getStringExtra("prod").toString().trim()
        Log.d("nombre_producto", nombre)

        this.productoViewModel = ViewModelProvider(this).get(ProductoViewModel::class.java)
        //this.productoViewModel.onCreateProductoDetalle(nombre)
        //Log.d("nombre" , nombre)
        this.productoViewModel.buscarProductoDetalle(nombre)

        productoViewModel.productoDetalle_list.observe(this , Observer {

            Log.d("prod_det_vista" , it.toString())
            val recyclerView = findViewById<RecyclerView>(R.id.recyclerView_visordetalle)

            recyclerView.layoutManager = LinearLayoutManager(this)

            if(it!=null){
                recyclerView.adapter= AdapterVisor(it, this)
            }

            val imagen = findViewById<ImageView>(R.id.imageViewdetalle)

            if (it != null) {
                //imagen.setImageResource(list_productoDetalle.get(0).productoModel.image)
                //Picasso.with(this).load(list_productoDetalle.get(0).productoModel.image).centerCrop().into(imagen)
                Picasso.with(this).load(it.get(0).productoModel.image).placeholder(R.drawable.placeholder).error(R.drawable.error).fit().centerInside().into(imagen);


            }



        })
        //val list_productoDetalle = intent.getSerializableExtra("prod") as Int?



    }
}