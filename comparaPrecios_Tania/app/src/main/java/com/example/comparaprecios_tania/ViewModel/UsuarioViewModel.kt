package com.example.comparaprecios_tania.ViewModel

import androidx.lifecycle.ViewModel
import com.example.comparaprecios_tania.Model.ProductoProvider
import com.example.comparaprecios_tania.Model.Usuario
import com.example.comparaprecios_tania.Model.UsuarioProvider

class UsuarioViewModel:ViewModel() {

    val usuarioProvider = UsuarioProvider()

fun getUsuario(email: String, clave:String): Boolean{

    val usuario = usuarioProvider.obtenerUsuario(email, clave)
    if(usuario!= null){
        return true
    }

    return false

}

}