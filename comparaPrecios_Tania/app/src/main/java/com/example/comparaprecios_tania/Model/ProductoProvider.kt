package com.example.comparaprecios_tania.Model

import com.example.comparaprecios_tania.R

class ProductoProvider {
    companion object{
    val productos = arrayListOf<ProductoModel>(

        ProductoModel(
            "Serum Retinol B3 ",
            "La Roche Posay ",
            R.drawable.ic_serum1
        ),
        ProductoModel("Pure Vitamin C10 Serum",
        "La Roche Posay ",
        R.drawable.ic_serum2),

        ProductoModel("Serum Hyalu B5",
            "La Roche Posay ",
            R.drawable.ic_serum3),

        ProductoModel("Crema de Manos  Dermocuidado",
            "Lechuga",
            R.drawable.ic_crema_mano)
    )
    }
}