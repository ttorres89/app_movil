package com.example.comparaprecios_tania.domain

import android.content.Context
import com.example.comparaprecios_tania.data.Model.Usuario
import com.example.comparaprecios_tania.data.UsuarioRepository

class GetUsuarioUseCase {

    private val repository = UsuarioRepository()

    suspend operator fun invoke(email:String, contrasena:String) = repository.getUsuario(email, contrasena)

}