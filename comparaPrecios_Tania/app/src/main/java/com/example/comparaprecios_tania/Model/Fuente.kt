package com.example.comparaprecios_tania.Model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class  Fuente(
    val nombre: String,
    val imagen: Int
): Parcelable