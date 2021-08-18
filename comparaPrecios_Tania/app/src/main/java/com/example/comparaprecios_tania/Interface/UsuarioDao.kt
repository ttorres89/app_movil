package com.example.comparaprecios_tania.Interface

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.comparaprecios_tania.Model.Usuario

@Dao
interface UsuarioDao {

    @Query("SELECT * from usuarios")
    fun getUsuarios(): List<Usuario>

    @Query("SELECT * FROM usuarios WHERE email = :email and contrasena=:clave")
    fun findUsuario(email: String, clave:String): Usuario

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertUsuario(usuario: Usuario)

}