package com.example.comparaprecios_tania.ViewModel

import androidx.lifecycle.ViewModel
import com.example.comparaprecios_tania.Model.ProductoModel
import com.example.comparaprecios_tania.Model.ProductoProvider
import com.example.comparaprecios_tania.Model.Producto_Detalle_Provider
import com.example.comparaprecios_tania.Model.Producto_detalle

class ProductoViewModel: ViewModel(){

    //var productoModel = MutableLiveData<List<ProductoModel>>()
    val productoProvider = ProductoProvider()
    val producto_detalle_provider = Producto_Detalle_Provider()



    fun obtenerLista(): ArrayList<ProductoModel> {
        return productoProvider.getProductos()
    }

    fun buscarProductoDetalle(nombre: String?): ArrayList<Producto_detalle>?{

        return nombre?.let { producto_detalle_provider.getProductoDetalle(it) }
    }



}