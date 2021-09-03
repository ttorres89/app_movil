package com.example.comparaprecios_tania.domain

import com.example.comparaprecios_tania.data.Model.ProductoModel
import com.example.comparaprecios_tania.data.Model.Producto_detalle
import com.example.comparaprecios_tania.data.ProductoDetalleRepository
import com.example.comparaprecios_tania.data.ProductoRepository

class GetProductoDetalleUseCase {

    private val repository = ProductoDetalleRepository()

    suspend operator fun invoke(nombre: String):List<Producto_detalle>? = repository.getProductoDetalle(nombre)
}