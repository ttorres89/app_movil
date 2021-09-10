package com.example.comparaprecios_tania.ui.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.comparaprecios_tania.data.Model.Producto_detalle
import com.example.comparaprecios_tania.data.ProductoDetalleRepository
import kotlinx.coroutines.launch

class ProductoDetalleViewModel: ViewModel() {

    val repositorioProductoDetalle = ProductoDetalleRepository()
    val productoDetalle_list= MutableLiveData<List<Producto_detalle>>()
    val prodDetalle_listBD = MutableLiveData<List<Producto_detalle>>()

    fun buscarProductoDetalle(nombre: String){
        viewModelScope.launch {
            productoDetalle_list.value=repositorioProductoDetalle.getProductoDetalle(nombre)

        }
    }

}