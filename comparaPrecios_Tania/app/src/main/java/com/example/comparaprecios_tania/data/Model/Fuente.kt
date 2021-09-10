package com.example.comparaprecios_tania.data.Model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class  Fuente(
    @SerializedName("id")  val id: Int,
    @SerializedName("nombre") val nombre: String,
    @SerializedName("imagen")  val imagen: String
): Parcelable