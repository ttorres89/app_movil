package com.example.comparaprecios_tania.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "usuarios")
data class  UsuarioEntity (
    @PrimaryKey @ColumnInfo(name = "id")  var id:Int,
    @ColumnInfo(name = "nombre") var nombre: String,
    @ColumnInfo(name = "apellido") var apellido: String,
    @ColumnInfo(name = "email") var email: String,
    @ColumnInfo(name = "contrasena") var contrasena: String
    )


