package com.example.comparaprecios_tania.domain

import com.example.comparaprecios_tania.data.Model.Producto_Detalle_Provider
import com.example.comparaprecios_tania.data.Model.Producto_detalle
import com.example.comparaprecios_tania.data.Model.Usuario
import com.example.comparaprecios_tania.data.Model.UsuarioProvider

class BuscarProductoDetalle {

    operator fun invoke(nombre:String): List<Producto_detalle>?{

        if(!Producto_Detalle_Provider.productosDetalles.isNullOrEmpty()){
            return Producto_Detalle_Provider.productosDetalles.filter { productoDetalle -> productoDetalle.productoModel.nombre.equals(nombre)}
        }
        return null
    }
}