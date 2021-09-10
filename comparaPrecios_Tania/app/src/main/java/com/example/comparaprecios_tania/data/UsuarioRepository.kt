package com.example.comparaprecios_tania.data

import android.util.Log
import com.example.comparaprecios_tania.data.Model.Usuario
import com.example.comparaprecios_tania.data.Model.UsuarioProvider
import com.example.comparaprecios_tania.data.network.ConversorUsuario
import com.example.comparaprecios_tania.data.network.UsuarioService
import com.example.comparaprecios_tania.db.config.Comparaprecio_app.Companion.db
import com.example.comparaprecios_tania.db.entities.UsuarioEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class UsuarioRepository () {

    private val usuarioApi = UsuarioService()
    //val allUsuario: Flow<List<UsuarioEntity>> = usuarioDao.getUsuarios()

    suspend fun getUsuario(email: String, contrasena: String):Usuario?{

        val usuarioServices = kotlin.runCatching { usuarioApi.getAllUsuario() }

        usuarioServices.onSuccess {
            UsuarioProvider.usuarios = it.body()!!
            Log.d("usuarios",UsuarioProvider.usuarios.toString() )
            if(it.body()!=null){
                val usuario: Usuario? = it.body()!!.find { usuario -> usuario.email.equals(email) && usuario.contrasena.equals(contrasena) }

                if (usuario!=null){
                    db.usuarioDao().insertUsuario(ConversorUsuario.convertirUsuarioEntity(usuario))
                }
            }
        }
        usuarioServices.onFailure { Log.e("Error", it.message.toString()) }

        val usuarioEntity: UsuarioEntity = obtenerUsuario_db(email,contrasena)

        if(usuarioEntity!=null){
            return ConversorUsuario.convertirUsuario(usuarioEntity)
        }
        return null

    }

    suspend fun obtenerUsuario_db(email: String, contrasena: String): UsuarioEntity{
        return withContext(Dispatchers.IO){
            db.usuarioDao().findUsuario(email, contrasena)

        }

    }



}