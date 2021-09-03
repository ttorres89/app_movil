package com.example.comparaprecios_tania.core
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    fun getRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://tania.rayunmapu.cl/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}