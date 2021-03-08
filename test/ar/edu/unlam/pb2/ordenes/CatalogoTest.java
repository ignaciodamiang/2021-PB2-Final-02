package ar.edu.unlam.pb2.ordenes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class CatalogoTest {

	@Test
	public void queQuitarProductoInexitenteLanceExcepcion() throws ProductoNoEncontradoException {
		Catalogo catalogo = new Catalogo();
		Producto producto = new Producto(1, "productoPrueba", 30.00);
		assertFalse(catalogo.quitarProducto(producto));
	}

	@Test
	public void queAlRemoverStockLaCantidadEnExistenciaSeaCorrecta() throws ProductoNoEncontradoException {
		Catalogo catalogo = new Catalogo();
		Producto producto = new Producto(1, "productoPrueba", 30.00);
		catalogo.agregarProducto(producto, 20);
		catalogo.removerStock(producto, 10);
		Integer esperado = 10;
		Integer resultado = catalogo.obtenerCantidad(producto);
		assertEquals(esperado, resultado);
	}
}
