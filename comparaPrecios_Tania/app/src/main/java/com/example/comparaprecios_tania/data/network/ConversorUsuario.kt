package com.example.comparaprecios_tania.data.network

import com.example.comparaprecios_tania.data.Model.Usuario
import com.example.comparaprecios_tania.db.entities.UsuarioEntity

class ConversorUsuario {

    companion object{
        fun convertirUsuarioEntity(usuario:Usuario): UsuarioEntity{
            return UsuarioEntity(usuario.id, usuario.nombre, usuario.apellido, usuario.email, usuario.contrasena)
        }

        fun convertirUsuario(usuarioEntity:UsuarioEntity): Usuario{
            return Usuario(usuarioEntity.id, usuarioEntity.nombre, usuarioEntity.apellido, usuarioEntity.email, usuarioEntity.contrasena)
        }
    }


}