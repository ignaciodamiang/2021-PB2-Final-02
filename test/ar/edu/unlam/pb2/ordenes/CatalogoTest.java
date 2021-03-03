package ar.edu.unlam.pb2.ordenes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CatalogoTest {

	@Test(expected = ProductoNoEncontradoException.class)
	public void queQuitarProductoInexitenteLanceExcepcion() throws ProductoNoEncontradoException {
		Catalogo catalogo = new Catalogo();
		Producto producto = new Producto(1, "productoPrueba", 30.00);
		catalogo.quitarProducto(producto);
	}

	@Test
	public void queAlRemoverStockLaCantidadEnExistenciaSeaCorrecta() {
		Catalogo catalogo = new Catalogo();
		Producto producto = new Producto(1, "productoPrueba", 30.00);
		catalogo.agregarProducto(producto, 10);
		Integer esperado = 10;
		Integer resultado = catalogo.obtenerCantidad(producto);
		assertEquals(esperado, resultado);
	}
}
