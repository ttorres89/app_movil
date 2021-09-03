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
import kotlin.jvm.internal.Intrinsics

class ProductoRepository {

    private val productoApi = ProductoService()

    suspend fun getProductos(): List<ProductoModel>?{
        val productoServices = kotlin.runCatching { productoApi.getAllProducto() }

        /*productoServices.onSuccess {
            ProductoProvider.productos = it
            Log.d("Productos", ProductoProvider.productos.toString())
        }
        productoServices.onFailure { Log.e("Error", it.message.toString()) }*/


        productoServices.onSuccess { it ->


            if(it.body()!=null){
                ProductoProvider.productos = it.body()!!
                it.body()!!.forEach{
                    Comparaprecio_app.db.productoDao().insertProductos(ConversorProducto.convertirProductoEntity(it))
                }
                return it.body()!!
            }



            /*withContext(Dispatchers.IO){
                var lista_usuario: List<UsuarioEntity> = getUsuario_db()
                Log.d("Usuarios_db", lista_usuario.toString())
            }*/
        }
        productoServices.onFailure { Log.e("Error", it.message.toString()) }


        /*val response: List<ProductoModel> = productoApi.getAllProducto()
        ProductoProvider.productos = response
        return response*/

        return null

    }

}