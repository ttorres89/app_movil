package com.example.comparaprecios_tania.data.network

import com.example.comparaprecios_tania.data.Model.ProductoModel
import com.example.comparaprecios_tania.data.Model.Producto_detalle
import com.example.comparaprecios_tania.data.Model.Usuario
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("/usuarios_tania.json")
    suspend fun getAllUsuarios(): Response<List<Usuario>>

    @GET("/producto_tania.json")
    suspend fun getAllPorducto(): Response<List<ProductoModel>>

    @GET("/producto_detalle_tania.json")
    suspend fun getAllPorductoDetalle(): Response<List<Producto_detalle>>

    @GET("/buscaproducto.php?")
    suspend fun getAllPorductoDetalle2(@Query("nombre") nombre:String): Response<List<Producto_detalle>>

}