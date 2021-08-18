package com.example.comparaprecios_tania.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.SearchView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.comparaprecios_tania.R
import com.example.comparaprecios_tania.ViewModel.ProductoViewModel
import com.example.comparaprecios_tania.databinding.ActivityLoginBinding
import com.example.comparaprecios_tania.databinding.ActivityMenuPrincipalBinding

class MenuPrincipal : AppCompatActivity(),CellClickListener {

    private lateinit var adapter: CustomAdapter
    private lateinit var productoViewModel:ProductoViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMenuPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        this.productoViewModel = ViewModelProvider(this).get(ProductoViewModel::class.java)

        val recyclerView = binding.recyclerView
        val searchView = binding.svSearch
        val listaProducto = productoViewModel.obtenerLista()
        val listSearch = listaProducto

        adapter = CustomAdapter(listaProducto!!, this)

        adapter.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                val intent=Intent(applicationContext, Visor_producto_detalle::class.java)
                val nombre = listaProducto.get(recyclerView.getChildAdapterPosition(v!!)).nombre
                val producto_detalle = productoViewModel.buscarProductoDetalle(nombre)
                val imagen = producto_detalle?.get(0)!!.productoModel.image

                //startActivity(intent.putExtra("prod",producto_detalle))
                startActivity(intent.putExtra("prod",producto_detalle))

                //startActivity(intent.putExtra("prod",imagen))

            }

        })

        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter=adapter


       // searchView.imeOptions = EditorInfo.IME_ACTION_DONE

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                //adapter.filter.filter(query)
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                //adapter.filter.filter(newText)
                //revisar
                return false
            }

        })




    }

    override fun onCellClickListener() {
        Toast.makeText(this,"Cell clicked", Toast.LENGTH_SHORT).show()
    }

    private fun dialogo(titulo:String, mensaje:String)
    {
        val builder = AlertDialog.Builder(this)
        builder.setTitle(titulo)
        builder.setMessage(mensaje)
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }


}