package com.example.comparaprecios_tania.Model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.comparaprecios_tania.Interface.UsuarioDao


@Database(
    entities = [Usuario::class],
    version = 1
)
abstract class UsuarioDB: RoomDatabase() {

    abstract fun UsuarioDao(): UsuarioDao

    /*companion object {
        private const val DATABASE_NAME = "score_database"
        @Volatile
        private var INSTANCE: UsuarioDB? = null

        fun getInstance(context: Context): UsuarioDB? {
            INSTANCE ?: synchronized(this) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    UsuarioDB::class.java,
                    DATABASE_NAME
                ).build()
            }
            return INSTANCE
        }
    }*/
}