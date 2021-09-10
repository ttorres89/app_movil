package com.example.comparaprecios_tania.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.comparaprecios_tania.data.Model.ProductoModel
import com.example.comparaprecios_tania.db.entities.ProductoEntity
import com.example.comparaprecios_tania.db.entities.UsuarioEntity

@Dao
interface ProductoDao {

    @Query("SELECT * from productos")
    suspend fun getProductos(): List<ProductoEntity>

    @Query("SELECT * from productos where id=:id")
    suspend fun getProductosId(id: Int): List<ProductoEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProductos(producto: ProductoEntity)
}