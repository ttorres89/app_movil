package com.example.comparaprecios_tania.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.comparaprecios_tania.Model.ProductoModel
import com.example.comparaprecios_tania.Model.ProductoProvider

class ProductoViewModel: ViewModel(){

    var productoModel = MutableLiveData<List<ProductoModel>>()
    var listaproducto = ProductoProvider.productos


    fun obtenerLista(){
        productoModel.value=listaproducto
    }


}