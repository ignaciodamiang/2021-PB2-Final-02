package ar.edu.unlam.pb2.ordenes;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProductoTest {
	@Test
	public void queSePuedePedirImpuestoSobreProducto() {
		Producto producto1 = new Producto(1, "producto1", 100.00);
		Double obtenido = producto1.getImpuesto();
		Double esperado = 21.00;
		assertEquals(esperado, obtenido);

	}

	@Test
	public void queSePuedePedirImpuestoSobreProductoDeLujo() {
		ProductoDeLujo producto = new ProductoDeLujo(1, "producto de lujo", 1000.00);
		Double obtenido = producto.getImpuesto();
		Double esperado = 360.0;
		assertEquals(esperado, obtenido);
	}

}
