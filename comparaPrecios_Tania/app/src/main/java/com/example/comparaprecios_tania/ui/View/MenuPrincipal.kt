package com.example.comparaprecios_tania.ui.View

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.SearchView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.comparaprecios_tania.data.Model.ProductoModel
import com.example.comparaprecios_tania.databinding.ActivityMenuPrincipalBinding
import com.example.comparaprecios_tania.ui.ViewModel.ProductoViewModel

class MenuPrincipal : AppCompatActivity(),CellClickListener {

    private lateinit var adapter: CustomAdapter
    private lateinit var productoViewModel:ProductoViewModel
    //val sharedPreference = getSharedPreferences("nombre_producto", Context.MODE_PRIVATE)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMenuPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        this.productoViewModel = ViewModelProvider(this).get(ProductoViewModel::class.java)
        this.productoViewModel.onCreateProducto()
        productoViewModel.product_list.observe(this, Observer {
            Log.d("Obtenido",it.toString() )
            adapter = CustomAdapter(it, this)
            adapter.setOnClickListener(object: View.OnClickListener{
                override fun onClick(v: View?) {
                    val intent=Intent(applicationContext, Visor_producto_detalle::class.java)
                    val nombre = it.get(binding.recyclerView.getChildAdapterPosition(v!!)).nombre

                    startActivity(intent.putExtra("prod",nombre))
                }
            })
            binding.recyclerView.layoutManager = LinearLayoutManager(this)

            binding.recyclerView.adapter=adapter
        })
        //val recyclerView = binding.recyclerView
        //val searchView = binding.svSearch
        //val listaProducto = productoViewModel.product_list
        //println(listaProducto)
        //val listSearch = listaProducto






       // searchView.imeOptions = EditorInfo.IME_ACTION_DONE

        binding.svSearch.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
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