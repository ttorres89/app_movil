package com.example.comparaprecios_tania.data

import android.util.Log
import com.example.comparaprecios_tania.data.Model.ProductoModel
import com.example.comparaprecios_tania.data.Model.ProductoProvider
import com.example.comparaprecios_tania.data.Model.Usuario
import com.example.comparaprecios_tania.data.Model.UsuarioProvider
import com.example.comparaprecios_tania.data.network.ConversorProducto
import com.example.comparaprecios_tania.data.network.ConversorUsuario
import com.example.comparaprecios_tania.data.network.ProductoService
import com.example.comparaprecios_tania.data.network.UsuarioService
import com.example.comparaprecios_tania.db.config.Comparaprecio_app
import com.example.comparaprecios_tania.db.config.Comparaprecio_app.Companion.db
import com.example.comparaprecios_tania.db.entities.ProductoEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlin.jvm.internal.Intrinsics

class ProductoRepository {
    private val productoApi = ProductoService()
     fun getProductos(): Flow<List<ProductoModel>> = flow{
       while (true) {
           val productoServices = kotlin.runCatching { productoApi.getAllProducto() }
           productoServices.onSuccess { it ->
               if (it.body() != null) {
                   ProductoProvider.productos = it.body()!!
                   it.body()!!.forEach {
                       Comparaprecio_app.db.productoDao()
                           .insertProductos(ConversorProducto.convertirProductoEntity(it))
                   }
               }
           }
           productoServices.onFailure { Log.e("Error", it.message.toString()) }
           val productosEntity:List<ProductoEntity> = db.productoDao().getProductos()
           if(productosEntity!=null){
               val productos = mutableListOf<ProductoModel>()
               productosEntity.map {
                   productos.add(ConversorProducto.convertirProducto(it))
               }
               emit(productos)
           }
           kotlinx.coroutines.delay(5000)
       }

    }.flowOn(Dispatchers.IO)

}