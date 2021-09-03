package com.example.comparaprecios_tania.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.comparaprecios_tania.db.entities.ProductoDetalleEntity
import com.example.comparaprecios_tania.db.entities.ProductoEntity

@Dao
interface ProductoDetalleDao {

    @Query("SELECT * from productosDetalle")
    suspend fun getProductosDetalle(): List<ProductoDetalleEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProductosDetalle(productosDetalle: List<ProductoDetalleEntity>)
}