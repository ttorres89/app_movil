package com.example.comparaprecios_tania.Model

import com.example.comparaprecios_tania.R

class ProductoProvider {

    private val productos = arrayListOf<ProductoModel>(

        ProductoModel(
            "Serum Retinol B3 ",
            "La Roche Posay ",
            "https://i.postimg.cc/TwwF5pqj/0565445761dffc2ee35cd7cf3546b28aa12460ca4c8b64dd06885e069813d5cb.jpg"
        ),
        ProductoModel("Pure Vitamin C10 Serum",
        "La Roche Posay ",
        "https://i.postimg.cc/xC8jjjXh/6f508f57cfeb707a3188d1a15ef5f4d5a516a4817c65e00d75ef641de95ac328.jpg"),

        ProductoModel("Serum Hyalu B5",
            "La Roche Posay ",
            "https://i.postimg.cc/jjgw4FPV/1b0669dcd7ff86ee1b6dab286f763b52c3b173f0d7ca5a5df2f533fab9112ee2.jpg"),

        ProductoModel("Crema de Manos  Dermocuidado",
            "Lechuga",
            "https://i.postimg.cc/x8K1hxJ1/ic-crema-mano.jpg")
    )

    fun getProductos(): ArrayList<ProductoModel> {

        return productos
    }

    }


