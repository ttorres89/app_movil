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

    /*suspend fun getjson(): List<Usuario>{

        var response = URL("https://tania.rayunmapu.cl/usuario_tania.json").readText()
        //here is another thread,handle response here
        val gson = Gson()
        val json: JSONObject = JSONObject(response)
        val usuarios: JSONObject = json.getJSONObject("usuarios")
        val exito = usuarios.getJSONArray("usuario")

         val lista_usuario = gson.(exito.toString(), Usuarios::class.java)
         //val response: Response<List<Usuario>>
         //responsebody() = lista_usuario


        return lista_usuario.usuarios
    }*/
}