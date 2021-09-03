package com.example.comparaprecios_tania.data


import android.util.Log
import com.example.comparaprecios_tania.data.Model.Producto_Detalle_Provider
import com.example.comparaprecios_tania.data.Model.Producto_detalle
import com.example.comparaprecios_tania.data.network.ConversorProducto
import com.example.comparaprecios_tania.data.network.ConversorProductoDetalle
import com.example.comparaprecios_tania.data.network.ProductoDetalleService
import com.example.comparaprecios_tania.db.config.Comparaprecio_app
import kotlin.jvm.internal.Intrinsics


class ProductoDetalleRepository {

    private val productoDetalleApi = ProductoDetalleService()

    /*suspend fun getProductosDetalle(): List<Producto_detalle>{
        val response: List<Producto_detalle> = productoDetalleApi.getAllProductoDetalle()
        Producto_Detalle_Provider.productosDetalles = response
        return response
    }*/

    suspend fun getProductoDetalle(nombre: String): List<Producto_detalle>?{
        val productoDetalleResponse = kotlin.runCatching { productoDetalleApi.getAllProductoDetalle(nombre) }
        productoDetalleResponse.onSuccess {
            if (it.body()!=null){
                Log.d("productoDetalle_list", it.body().toString())
                //Comparaprecio_app.db.productoDetalleDao().insertProductosDetalle(ConversorProductoDetalle.convertirProductoDetalleEntity(it.body()))
                return it.body()!!
            }
        }
        productoDetalleResponse.onFailure {
            Log.d("error_productoDetalle", it.toString())
        }
        return null

    }
}