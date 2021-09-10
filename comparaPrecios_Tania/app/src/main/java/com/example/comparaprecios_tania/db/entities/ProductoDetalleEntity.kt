package com.example.comparaprecios_tania.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.example.comparaprecios_tania.data.Model.Fuente
import com.example.comparaprecios_tania.data.Model.ProductoModel
import com.google.gson.annotations.SerializedName

@Entity (tableName = "productosDetalle",
    foreignKeys = arrayOf(
    ForeignKey(
        entity = ProductoEntity::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("id_producto")
    ),
    ForeignKey(
        entity = FuenteEntity::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("id_fuente")
    )
))

data class ProductoDetalleEntity (
    @PrimaryKey @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name ="id_producto") val id_producto: Int,
    @ColumnInfo(name ="precio") val precio: Int,
    @ColumnInfo(name ="id_fuente")  val id_fuente: Int,
    @ColumnInfo(name ="url") val url: String
        )