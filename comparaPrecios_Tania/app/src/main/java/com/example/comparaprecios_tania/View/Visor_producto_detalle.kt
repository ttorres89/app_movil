package com.example.comparaprecios_tania.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.comparaprecios_tania.Model.Producto_detalle
import com.example.comparaprecios_tania.R
import com.squareup.picasso.Picasso

class Visor_producto_detalle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visor_producto_detalle)

        val list_productoDetalle = intent.getParcelableArrayListExtra<Producto_detalle>("prod")

        //val list_productoDetalle = intent.getSerializableExtra("prod") as Int?
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView_visordetalle)

        recyclerView.layoutManager = LinearLayoutManager(this)

        if(list_productoDetalle!=null){
            recyclerView.adapter= AdapterVisor(list_productoDetalle)
        }



        val imagen = findViewById<ImageView>(R.id.imageViewdetalle)

        if (list_productoDetalle != null) {
            //imagen.setImageResource(list_productoDetalle.get(0).productoModel.image)
            //Picasso.with(this).load(list_productoDetalle.get(0).productoModel.image).centerCrop().into(imagen)
            Picasso.with(this).load(list_productoDetalle.get(0).productoModel.image).placeholder(R.drawable.placeholder).error(R.drawable.error).fit().centerInside().into(imagen);


        }


    }
}