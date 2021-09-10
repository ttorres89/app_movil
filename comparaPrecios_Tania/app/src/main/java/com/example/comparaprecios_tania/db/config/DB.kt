package com.example.comparaprecios_tania.db.config

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.comparaprecios_tania.db.dao.FuenteDao
import com.example.comparaprecios_tania.db.dao.ProductoDao
import com.example.comparaprecios_tania.db.dao.ProductoDetalleDao
import com.example.comparaprecios_tania.db.dao.UsuarioDao
import com.example.comparaprecios_tania.db.entities.FuenteEntity
import com.example.comparaprecios_tania.db.entities.ProductoDetalleEntity
import com.example.comparaprecios_tania.db.entities.ProductoEntity
import com.example.comparaprecios_tania.db.entities.UsuarioEntity


@Database(
    entities = [UsuarioEntity::class, ProductoEntity::class, ProductoDetalleEntity::class, FuenteEntity::class],
    version = 8,
    exportSchema = false
)
abstract class DB: RoomDatabase() {

    abstract fun usuarioDao(): UsuarioDao
    abstract fun productoDao(): ProductoDao
    abstract fun productoDetalleDao(): ProductoDetalleDao
    abstract fun fuenteDao(): FuenteDao



    /*companion object {
        private const val DATABASE_NAME = "appDB"

        @Volatile
        private var INSTANCE: DB? = null

        fun getInstance(context: Context): DB? {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    DB::class.java,
                    DATABASE_NAME
                ).build()

                INSTANCE = instance
                // return instance
                instance
                return INSTANCE
            }
        }
    }*/
}