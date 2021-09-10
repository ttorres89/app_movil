package com.example.comparaprecios_tania.ui.ViewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.comparaprecios_tania.data.Model.ProductoModel
import com.example.comparaprecios_tania.data.Model.ProductoProvider
import com.example.comparaprecios_tania.data.Model.Producto_Detalle_Provider
import com.example.comparaprecios_tania.data.Model.Producto_detalle
import com.example.comparaprecios_tania.data.ProductoDetalleRepository
import com.example.comparaprecios_tania.data.ProductoRepository
import com.example.comparaprecios_tania.domain.*
import kotlinx.coroutines.launch

class ProductoViewModel: ViewModel(){


    val repositoryProducto = ProductoRepository()
    val product_list = repositoryProducto.getProductos().asLiveData()

    val getproductoUseCase = GetProductosUseCase()


    fun onCreateProducto(){
        viewModelScope.launch {
            getproductoUseCase()
        }

    }



    fun obtenerLista(): List<ProductoModel> {
        return ProductoProvider.productos
    }




}