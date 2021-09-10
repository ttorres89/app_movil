package com.example.comparaprecios_tania.data


import android.util.Log
import com.example.comparaprecios_tania.data.Model.Fuente
import com.example.comparaprecios_tania.data.Model.Producto_Detalle_Provider
import com.example.comparaprecios_tania.data.Model.Producto_detalle
import com.example.comparaprecios_tania.data.network.ConversorFuente
import com.example.comparaprecios_tania.data.network.ConversorProducto
import com.example.comparaprecios_tania.data.network.ConversorProductoDetalle
import com.example.comparaprecios_tania.data.network.ProductoDetalleService
import com.example.comparaprecios_tania.db.config.Comparaprecio_app
import com.example.comparaprecios_tania.db.entities.ProductoEntity
import kotlin.jvm.internal.Intrinsics


class ProductoDetalleRepository {

    private val productoDetalleApi = ProductoDetalleService()
    lateinit var lista_fuente:MutableList<Fuente>


    suspend fun getProductoDetalle(nombre: String): List<Producto_detalle>?{
        val productoDetalleResponse = kotlin.runCatching { productoDetalleApi.getAllProductoDetalle(nombre) }
        productoDetalleResponse.onSuccess {
            if (it.body()!=null){
                lista_fuente = it.body().orEmpty().map { it.fuente } as MutableList<Fuente>
                var lista_fuente_unique = lista_fuente.distinct()
                Log.d("productoDetalle_list", it.body().toString())
                Log.d("fuente_list", lista_fuente_unique.toString())
                lista_fuente_unique.map { Comparaprecio_app.db.fuenteDao().insertFuente(ConversorFuente.convertirFuenteEntity(it))}

                Comparaprecio_app.db.productoDetalleDao().insertProductosDetalle(ConversorProductoDetalle.convertirProductoDetalleEntity(it.body()!!))


                return it.body()!!
            }
        }
        productoDetalleResponse.onFailure {
            Log.d("error_productoDetalle", it.toString())
        }
        return null

    }
}