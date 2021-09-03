package com.example.comparaprecios_tania.ui.ViewModel

import com.example.comparaprecios_tania.data.Model.Fuente
import com.example.comparaprecios_tania.data.Model.ProductoModel
import com.example.comparaprecios_tania.data.Model.Producto_Detalle_Provider
import com.example.comparaprecios_tania.data.Model.Producto_detalle
import com.example.comparaprecios_tania.R
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import org.mockito.Mockito

class ProductoViewModelTest {

    private lateinit var productoDetalleProviderMockito: Producto_Detalle_Provider
    private lateinit var productoViewModel: ProductoViewModel
    private lateinit var producto_detelle_Esperado:ArrayList<Producto_detalle>




    @Before
    fun setUp() {

        productoViewModel = ProductoViewModel()
        productoDetalleProviderMockito = Mockito.mock(Producto_Detalle_Provider::class.java)

        producto_detelle_Esperado = arrayListOf<Producto_detalle>(

            Producto_detalle(
                ProductoModel(
                    "Serum Retinol B3 ",
                    "La Roche Posay ",
                    R.drawable.ic_serum2
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
                    R.drawable.ic_serum2
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
                    R.drawable.ic_serum2
                ),
                27199,
                Fuente(
                    "salcobrand",
                    R.drawable.ic_salcobrand
                ),
                "https://salcobrand.cl/products/retinol-b3-serum-30ml?default_sku=574500&queryID=5a0ec0b35b8232c5169c2156957d9d86")
        )

        Mockito.`when`(productoDetalleProviderMockito.getProductoDetalle("Serum Retinol B3 ")).thenReturn(producto_detelle_Esperado)

    }

    @Test
    fun buscarProductoDetalle() {
        assertEquals(producto_detelle_Esperado,productoViewModel.buscarProductoDetalle("Serum Retinol B3 "))
    }
}