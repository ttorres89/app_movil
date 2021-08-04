package com.example.comparaprecios_tania.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.comparaprecios_tania.Model.ProductoModel
import com.example.comparaprecios_tania.Model.ProductoProvider
import com.example.comparaprecios_tania.R
import java.util.*
import kotlin.collections.ArrayList

class MenuPrincipal : AppCompatActivity(){

    private lateinit var adapter: CustomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_principal)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val searchView = findViewById<SearchView>(R.id.svSearch)
        val listaProducto = ProductoProvider.productos
        val listSearch = listaProducto

        adapter = CustomAdapter()

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


}