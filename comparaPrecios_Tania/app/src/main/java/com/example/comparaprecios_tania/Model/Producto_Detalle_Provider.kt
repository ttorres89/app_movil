package com.example.comparaprecios_tania.Model

import com.example.comparaprecios_tania.R

class Producto_Detalle_Provider {


    private val productos_detalle= arrayListOf<Producto_detalle>(

        Producto_detalle(
            ProductoModel(
                "Serum Retinol B3 ",
                "La Roche Posay ",
                "https://i.postimg.cc/TwwF5pqj/0565445761dffc2ee35cd7cf3546b28aa12460ca4c8b64dd06885e069813d5cb.jpg"
            ),
            34199,
            Fuente(
                "Farmacia Ahumada",
                R.drawable.ic_ahumada
            ),
            "https://www.farmaciasahumada.cl/serum-la-roche-posay-hyalu-b5-50ml.html"
        ),

        Producto_detalle(
            ProductoModel(
                "Serum Retinol B3 ",
                "La Roche Posay ",
                "https://i.postimg.cc/TwwF5pqj/0565445761dffc2ee35cd7cf3546b28aa12460ca4c8b64dd06885e069813d5cb.jpg"
            ),
            33990,
        Fuente(
            "Cruz Verde",
            R.drawable.ic_cruzverde
        ),
        "https://www.cruzverde.cl/retinol-b3-serum-concentrado-antiarrugas-30-ml/298788.html"
        ),

        Producto_detalle(
            ProductoModel(
                    "Serum Retinol B3 ",
                    "La Roche Posay ",
                "https://i.postimg.cc/TwwF5pqj/0565445761dffc2ee35cd7cf3546b28aa12460ca4c8b64dd06885e069813d5cb.jpg"
                ),
        27199,
        Fuente(
            "salcobrand",
            R.drawable.ic_salcobrand
        ),
        "https://salcobrand.cl/products/retinol-b3-serum-30ml?default_sku=574500&queryID=5a0ec0b35b8232c5169c2156957d9d86"),

            Producto_detalle(
            ProductoModel(
                "Pure Vitamin C10 Serum",
                "La Roche Posay ",
                "https://i.postimg.cc/xC8jjjXh/6f508f57cfeb707a3188d1a15ef5f4d5a516a4817c65e00d75ef641de95ac328.jpg"
            ),
                34199,
        Fuente(
            "Farmacia Ahumada",
            R.drawable.ic_ahumada
        ),
        "https://www.farmaciasahumada.cl/la-roche-posay-pure-vitamin-c10-serum-x-30-ml.html"
    ),

    Producto_detalle(
        ProductoModel(
            "Pure Vitamin C10 Serum",
            "La Roche Posay ",
            "https://i.postimg.cc/xC8jjjXh/6f508f57cfeb707a3188d1a15ef5f4d5a516a4817c65e00d75ef641de95ac328.jpg"
        ),
        25492,
    Fuente(
    "Cruz Verde",
    R.drawable.ic_cruzverde
    ),
    "https://www.cruzverde.cl/pure-vitamin-c10-serum-anti-arrugas-anti-oxidante-y-renovador-30-ml/295114.html"
    ),

    Producto_detalle(
        ProductoModel(
            "Pure Vitamin C10 Serum",
            "La Roche Posay ",
            "https://i.postimg.cc/xC8jjjXh/6f508f57cfeb707a3188d1a15ef5f4d5a516a4817c65e00d75ef641de95ac328.jpg"
        ),
    27359,
    Fuente(
    "salcobrand",
    R.drawable.ic_salcobrand
    ),
    "https://salcobrand.cl/products/pure-vitamin-c10-serum?default_sku=3970038&queryID=3417ce2f94c5482407c3399f33428720"),

    Producto_detalle(
    ProductoModel(
    "Serum Hyalu B5",
    "La Roche Posay ",
    "https://i.postimg.cc/jjgw4FPV/1b0669dcd7ff86ee1b6dab286f763b52c3b173f0d7ca5a5df2f533fab9112ee2.jpg"
    ),
    34399,
    Fuente(
    "Farmacia Ahumada",
    R.drawable.ic_ahumada
    ),
    "https://www.farmaciasahumada.cl/la-roche-posay-serum-hyalu-b5-x-30-ml.html"
    ),

    Producto_detalle(
        ProductoModel(
            "Serum Hyalu B5",
            "La Roche Posay ",
            "https://i.postimg.cc/jjgw4FPV/1b0669dcd7ff86ee1b6dab286f763b52c3b173f0d7ca5a5df2f533fab9112ee2.jpg"
        ),
    25492,
    Fuente(
    "Cruz Verde",
    R.drawable.ic_cruzverde
    ),
    "https://www.cruzverde.cl/hyalu-b5-serum-reparador-y-rellenador-piel-sensible-30-ml/291809.html"
    ),

    Producto_detalle(
        ProductoModel(
            "Serum Hyalu B5",
            "La Roche Posay ",
            "https://i.postimg.cc/jjgw4FPV/1b0669dcd7ff86ee1b6dab286f763b52c3b173f0d7ca5a5df2f533fab9112ee2.jpg"
        ),
    27359,
    Fuente(
    "salcobrand",
    R.drawable.ic_salcobrand
    ),
    "https://salcobrand.cl/products/hyalu-b5-serum-rellenador-para-piel-sensible"),

        Producto_detalle(
            ProductoModel(
                "Crema de Manos  Dermocuidado",
                "Legucha",
               "https://i.postimg.cc/x8K1hxJ1/ic-crema-mano.jpg"
            ),
            2599,
            Fuente(
                "Farmacia Ahumada",
                R.drawable.ic_ahumada
            ),
            "https://www.farmaciasahumada.cl/crema-de-manos-lechuga-dermocuidado-urea-75g.html"
        ),

        Producto_detalle(
            ProductoModel(
                "Crema de Manos  Dermocuidado",
                "Legucha",
                "https://i.postimg.cc/x8K1hxJ1/ic-crema-mano.jpg"
            ),
            2017,
            Fuente(
                "Cruz Verde",
                R.drawable.ic_cruzverde
            ),
            "https://www.cruzverde.cl/crema-de-manos-dermo-cuidado-48-horas-hidratacion-prolongada-para-piel-extra-seca-75-gr/299435.html"
        )
    )


    fun getProductoDetalle(nombre: String): ArrayList<Producto_detalle>?{
        var productos_detalle =  productos_detalle.filter { producto_detalle_aux -> producto_detalle_aux.productoModel.nombre.equals(nombre)  } as ArrayList<Producto_detalle>
        return productos_detalle
    }

}
