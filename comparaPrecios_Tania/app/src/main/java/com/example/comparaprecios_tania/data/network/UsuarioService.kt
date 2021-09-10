package com.example.comparaprecios_tania.data.network

import android.util.Log
import com.example.comparaprecios_tania.core.RetrofitHelper
import com.example.comparaprecios_tania.data.Model.ProductoModel
import com.example.comparaprecios_tania.data.Model.Usuario
import com.example.comparaprecios_tania.data.Model.Usuarios
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONArray
import org.json.JSONObject
import retrofit2.Response
import java.net.URL

class UsuarioService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getAllUsuario(): Response<List<Usuario>>{
        return withContext(Dispatchers.IO){
            retrofit.create(ApiService::class.java).getAllUsuarios()
        }
    }

}