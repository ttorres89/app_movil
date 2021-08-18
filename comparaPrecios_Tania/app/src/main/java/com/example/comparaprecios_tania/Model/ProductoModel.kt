package com.example.comparaprecios_tania.Model

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ProductoModel(
    val nombre: String,
    val marca: String,
    val image: String
): Parcelable