package ar.edu.unlam.pb2.ordenes;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class LineaOrdenTest {
	@Test
	public void queSePuedeCalcularElTotalPorDetalle() {
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();

		Catalogo catalogo = new Catalogo();
		Producto producto1 = new Producto(1, "Producto uno", 50.00);
		catalogo.agregarProducto(producto1, 10);
		Producto producto2 = new Producto(1, "Producto dos", 75.00);
		catalogo.agregarProducto(producto2, 15);

		Orden orden = new Orden(date, 1122);
		LineaOrden lineaOrden1 = new LineaOrden(producto1, 5);
		LineaOrden lineaOrden2 = new LineaOrden(producto2, 10);

		orden.agregarLinea(lineaOrden1);
		orden.agregarLinea(lineaOrden2);

		Double precioEsperado = ((50.00 * 5) + (75.00 * 10)) * 1.21;
		Double precioObtenido = orden.obtenerPrecioTotal();

		assertEquals(precioEsperado, precioObtenido);

	}

}
