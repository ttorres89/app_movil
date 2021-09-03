package com.example.comparaprecios_tania.data.network

import com.example.comparaprecios_tania.data.Model.Fuente
import com.example.comparaprecios_tania.data.Model.ProductoModel
import com.example.comparaprecios_tania.db.entities.FuenteEntity
import com.example.comparaprecios_tania.db.entities.ProductoEntity

class ConversorFuente {

    companion object{
        fun convertirFuenteEntity(fuente: Fuente): FuenteEntity {
            return FuenteEntity(fuente.id, fuente.nombre, fuente.imagen)
        }

        fun convertirFuente(fuenteEntity: FuenteEntity): Fuente {
            return Fuente(fuenteEntity.id, fuenteEntity.nombre, fuenteEntity.imagen)
        }
    }
}