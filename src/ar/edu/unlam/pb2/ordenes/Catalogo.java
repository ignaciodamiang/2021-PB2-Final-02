package ar.edu.unlam.pb2.ordenes;

import java.util.HashMap;

/*
 * Mantiene una colecci�n de Productos, los cuales no pueden
 * estar duplicados. Adem�s, por cada Producto se desea mantener 
 * la cantidad del mismo en Stock,
 */
public class Catalogo {

	/*
	 * �Cu�l es la colecci�n adecuada?
	 */
	HashMap<Producto, Integer> productos;

	public Catalogo() {
		productos = new HashMap<Producto, Integer>();
	}

	/*
	 * Agregar producto al cat�logo. No se permiten Productos duplicados. Criterio:
	 * n�mero de Producto.
	 */
	public Boolean agregarProducto(Producto producto, Integer cantidad) {
		if (!productos.containsKey(producto)) {
			productos.put(producto, cantidad);
			return true;
		} else if (productos.containsKey(producto) && productos.get(producto) == null) {
			productos.put(producto, cantidad);
			return true;
		} else if (productos.containsKey(producto) && productos.get(producto) != null) {
			Integer cantidadEnStock = obtenerCantidad(producto);
			productos.put(producto, cantidadEnStock + cantidad);
			return true;
		} else
			return false;
	}

	/*
	 * Remueve Producto del Cat�logo. Lanza una Excepci�n si el Producto no se
	 * encuentra en el Cat�logo.
	 */
	public Boolean quitarProducto(Producto producto) throws ProductoNoEncontradoException {
		if (!productos.containsKey(producto)) {
			new ProductoNoEncontradoException("Este producto no se encuentra en el catalogo");
			return false;
		} else if (productos.containsKey(producto) && productos.get(producto) > 0) {
			productos.put(producto, (productos.get(producto) - 1));
			return true;
		} else
			return false;
	}

	/*
	 * Descuenta la cantidad deseada de producto del Stock.
	 */

	public Boolean removerStock(Producto producto, Integer cantidad) throws ProductoNoEncontradoException {
		if (productos.containsKey(producto) && productos.get(producto) != null) {
			Integer cantidadEnStock = productos.get(producto);
			if (cantidadEnStock >= cantidad) {
				cantidadEnStock = cantidadEnStock - cantidad;
				productos.put(producto, cantidadEnStock);
				return true;
			}
		}
		return false;
	}

	/*
	 * Devuleve la cantidad de Productos en existencia.
	 */
	public Integer obtenerCantidad(Producto producto) {
		if (productos.containsKey(producto)) {
			return productos.get(producto);
		} else
			return null;
	}
}
