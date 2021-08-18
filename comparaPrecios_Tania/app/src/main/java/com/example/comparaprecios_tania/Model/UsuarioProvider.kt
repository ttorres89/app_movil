package com.example.comparaprecios_tania.Model

import com.example.comparaprecios_tania.R

class UsuarioProvider {

        private val usuarios = arrayListOf<Usuario>(

            Usuario(
                1,
                "Tania",
                "Torres",
                "torres.tania89@gmail.com",
                "12345"
            ),
            Usuario(
                2,
                "Natali",
                "Torres",
                "n.torres.reyes@gmail.com",
                "12345"
            )

        )

    fun obtenerUsuario(email: String, clave:String): Usuario?{

        var usuario =  usuarios.find { usuario_aux -> usuario_aux.email.equals(email) &&  usuario_aux.contrasena.equals(clave) }

        return usuario
    }
}