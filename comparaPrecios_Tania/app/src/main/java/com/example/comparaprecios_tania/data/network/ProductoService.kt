package com.example.comparaprecios_tania.data.network

import com.example.comparaprecios_tania.core.RetrofitHelper
import com.example.comparaprecios_tania.data.Model.ProductoModel
import com.example.comparaprecios_tania.data.Model.Usuario
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class ProductoService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getAllProducto(): Response<List<ProductoModel>> {
        return withContext(Dispatchers.IO){
            retrofit.create(ApiService::class.java).getAllPorducto()
        }
    }
}