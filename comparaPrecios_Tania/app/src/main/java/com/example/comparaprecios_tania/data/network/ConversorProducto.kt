package com.example.comparaprecios_tania.data.network

import com.example.comparaprecios_tania.data.Model.ProductoModel
import com.example.comparaprecios_tania.data.Model.Usuario
import com.example.comparaprecios_tania.db.entities.ProductoEntity
import com.example.comparaprecios_tania.db.entities.UsuarioEntity

class ConversorProducto {

    companion object{
        fun convertirProductoEntity(producto: ProductoModel): ProductoEntity {
            return ProductoEntity(producto.id, producto.nombre, producto.marca, producto.image)
        }

        fun convertirProducto(productoEntity: ProductoEntity): ProductoModel {
            return ProductoModel(productoEntity.id, productoEntity.nombre, productoEntity.marca, productoEntity.image)
        }
    }

}