package com.example.comparaprecios_tania.data.Model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


data class  Producto_detalle(
    @SerializedName("id") val id: Int,
    @SerializedName("producto") val productoModel: ProductoModel,
    @SerializedName("precio") val precio: Int,
    @SerializedName("fuente")  val fuente: Fuente,
    @SerializedName("url") val url: String?
)