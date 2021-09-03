package com.example.comparaprecios_tania.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.comparaprecios_tania.data.Model.Usuario
import com.example.comparaprecios_tania.db.entities.UsuarioEntity
import kotlinx.coroutines.flow.Flow


@Dao
interface UsuarioDao {

    @Query("SELECT * from usuarios")
    fun getUsuarios(): List<UsuarioEntity>
    //fun getUsuarios(): List<Usuario>

    @Query("SELECT * FROM usuarios WHERE email = :email and contrasena=:clave")
     fun findUsuario(email: String, clave:String): UsuarioEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUsuario (usuario: UsuarioEntity)

}