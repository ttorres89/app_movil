package com.example.comparaprecios_tania.data.Model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


data class  Usuario (
    @SerializedName("id") val id:Int,
    @SerializedName("nombre")val nombre: String,
    @SerializedName("apellido")val apellido: String,
    @SerializedName("email")val email: String,
    @SerializedName("contrasena") val contrasena: String)