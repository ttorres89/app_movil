package com.example.comparaprecios_tania.data.network

import com.example.comparaprecios_tania.data.Model.ProductoModel
import com.example.comparaprecios_tania.data.Model.Producto_detalle
import com.example.comparaprecios_tania.db.entities.ProductoDetalleEntity
import com.example.comparaprecios_tania.db.entities.ProductoEntity

class ConversorProductoDetalle {

    companion object{
        fun convertirProductoDetalleEntity(producto_detalle: List<Producto_detalle>): List<ProductoDetalleEntity>{
            val productoDetalleEntity = mutableListOf<ProductoDetalleEntity>()
            producto_detalle.map {
                productoDetalleEntity.add(ProductoDetalleEntity(it.id, it.productoModel.id, it.precio, it.fuente.id , it.url!!))
            }
            return productoDetalleEntity
        }

        fun convertirProductoDetalle(producto_detalleEntity: List<ProductoDetalleEntity>): List<Producto_detalle> {

            val productoDetalle = mutableListOf<Producto_detalle>()
            producto_detalleEntity.map {
                //productoDetalle.add(Producto_detalle(ProductoModel(it.id_producto,), it.precio, it.id_fuente , it.url))
            }
            return productoDetalle
        }
    }
}