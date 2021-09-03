package com.example.comparaprecios_tania.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.comparaprecios_tania.db.entities.FuenteEntity
import com.example.comparaprecios_tania.db.entities.ProductoEntity


@Dao
interface FuenteDao {

    @Query("SELECT * from fuente")
    suspend fun getFuente(): List<FuenteEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFuente(fuente: FuenteEntity)
}