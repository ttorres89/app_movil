package com.example.comparaprecios_tania.domain

import com.example.comparaprecios_tania.data.Model.ProductoModel
import com.example.comparaprecios_tania.data.Model.Usuario
import com.example.comparaprecios_tania.data.ProductoRepository
import com.example.comparaprecios_tania.data.UsuarioRepository

class GetProductosUseCase {

    private val repository = ProductoRepository()

    suspend operator fun invoke() = repository.getProductos()
}