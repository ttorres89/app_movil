package com.example.comparaprecios_tania.Model

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class  Producto_detalle(
    val productoModel: ProductoModel,
    val precio: Int,
    val fuente: Fuente,
    val url: String?
): Parcelable