package com.example.comparaprecios_tania.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "productos")
data class ProductoEntity (
    @PrimaryKey @ColumnInfo(name = "id")  var id:Int,
    @ColumnInfo(name = "nombre") var nombre: String,
    @ColumnInfo(name = "marca") var marca: String,
    @ColumnInfo(name = "image") var image: String,
        )