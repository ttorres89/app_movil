package com.example.comparaprecios_tania.domain

import com.example.comparaprecios_tania.data.Model.Usuario
import com.example.comparaprecios_tania.data.Model.UsuarioProvider

class BuscarUsuarios {

 operator fun invoke(email:String, clave:String):Usuario?{

     if(!UsuarioProvider.usuarios.isNullOrEmpty()){
         return UsuarioProvider.usuarios.find { usuario -> usuario.email.equals(email) && usuario.contrasena.equals(clave)}
     }

     return null
 }
}