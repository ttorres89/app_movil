package com.example.comparaprecios_tania.data.network

import com.example.comparaprecios_tania.core.RetrofitHelper
import com.example.comparaprecios_tania.data.Model.ProductoModel
import com.example.comparaprecios_tania.data.Model.Producto_detalle
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class ProductoDetalleService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getAllProductoDetalle(nombre: String): Response<List<Producto_detalle>> {
        return withContext(Dispatchers.IO){
            retrofit.create(ApiService::class.java).getAllPorductoDetalle2(nombre)
        }


    }
}