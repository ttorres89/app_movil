package com.example.comparaprecios_tania.Model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "usuarios")
data class  Usuario (
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val nombre: String,
    val apellido: String,
    val email: String,
    val contrasena: String)