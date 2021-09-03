package com.example.comparaprecios_tania.data.Model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


data class ProductoModel(
    @SerializedName("id") val id: Int,
    @SerializedName("nombre") val nombre: String,
    @SerializedName("marca")val marca: String,
    @SerializedName("image") val image: String
)