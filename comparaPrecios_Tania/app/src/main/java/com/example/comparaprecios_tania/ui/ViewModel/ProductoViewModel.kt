package com.example.comparaprecios_tania.ui.ViewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.comparaprecios_tania.data.Model.ProductoModel
import com.example.comparaprecios_tania.data.Model.ProductoProvider
import com.example.comparaprecios_tania.data.Model.Producto_Detalle_Provider
import com.example.comparaprecios_tania.data.Model.Producto_detalle
import com.example.comparaprecios_tania.data.ProductoDetalleRepository
import com.example.comparaprecios_tania.domain.*
import kotlinx.coroutines.launch

class ProductoViewModel: ViewModel(){

    //var productoModel = MutableLiveData<List<ProductoModel>>()
    //val productoProvider = ProductoProvider()
    //val producto_detalle_provider = Producto_Detalle_Provider()
    val product_list = MutableLiveData<List<ProductoModel>>()
    val productoDetalle_list= MutableLiveData<List<Producto_detalle>>()
    val repositorioProductoDetalle = ProductoDetalleRepository()

    val getproductoUseCase = GetProductosUseCase()
    val getProductoDetalleUseCase = GetProductoDetalleUseCase()
    val buscarProductoDetalle = BuscarProductoDetalle()

    fun onCreateProducto(){
        viewModelScope.launch {
            getproductoUseCase()
            product_list.value = ProductoProvider.productos
            //getProductoDetalleUseCase()
            //productoDetalle_list.value = Producto_Detalle_Provider.productosDetalles

        }

    }

    fun onCreateProductoDetalle(nombre:String){


    }

    fun obtenerLista(): List<ProductoModel> {
        return ProductoProvider.productos
    }

    fun buscarProductoDetalle(nombre: String){
        viewModelScope.launch {
            productoDetalle_list.value=repositorioProductoDetalle.getProductoDetalle(nombre)


        }
    }



}