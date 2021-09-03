package com.example.comparaprecios_tania.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "fuente")
data class FuenteEntity (
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "nombre") val nombre: String,
    @ColumnInfo(name = "imagen")  val imagen: String)