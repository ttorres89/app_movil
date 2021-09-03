package com.example.comparaprecios_tania.db.config

import android.app.Application
import androidx.room.Room


class Comparaprecio_app: Application() {

    companion object{
        lateinit var db:DB
    }

    override fun onCreate(){
        super.onCreate()
        db = Room.databaseBuilder(this, DB::class.java, "dbcompraraprecio").build()
    }
}