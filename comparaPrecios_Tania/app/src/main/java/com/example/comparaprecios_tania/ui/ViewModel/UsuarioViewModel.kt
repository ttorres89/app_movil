package com.example.comparaprecios_tania.ui.ViewModel

import android.app.Application
import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.comparaprecios_tania.data.Model.Usuario
import com.example.comparaprecios_tania.data.Model.UsuarioProvider
import com.example.comparaprecios_tania.data.UsuarioRepository
import com.example.comparaprecios_tania.domain.BuscarUsuarios
import com.example.comparaprecios_tania.domain.GetUsuarioUseCase
import kotlinx.coroutines.launch

class UsuarioViewModel:ViewModel() {


    val usuarioProvider = UsuarioProvider()
    val getUsuarioUseCase = GetUsuarioUseCase()
    val buscarUsuario = BuscarUsuarios()
    val usuario = MutableLiveData<Usuario>()
    private val repository = UsuarioRepository()



    fun getUsuario(email: String, clave: String) {

        /* val usuario = buscarUsuario(email, clave)
    if(usuario!= null){
        return true
    }
    return false*/

        viewModelScope.launch {
            usuario.value = repository.getUsuario(email, clave)
        }
    }

}