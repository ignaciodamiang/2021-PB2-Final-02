package ar.edu.unlam.pb2.ordenes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Mantiene una colecci�n de Productos, los cuales no pueden
 * estar duplicados. Adem�s, por cada Producto se desea mantener 
 * la cantidad del mismo en Stock,
 */
public class Catalogo {

	/*
	 * �Cu�l es la colecci�n adecuada?
	 */
	HashSet<Producto> productos;

	public Catalogo() {
		productos = new HashSet<Producto>();
	}

	/*
	 * Agregar producto al cat�logo. No se permiten Productos duplicados. Criterio:
	 * n�mero de Producto.
	 */
	public Boolean agregarProducto(Producto producto, Integer cantidad) {
		Boolean anadido = null;
		for (int i = 0; i < cantidad; i++) {
			anadido = productos.add(producto);
		}
		return anadido;
	}

	/*
	 * Remueve Producto del Cat�logo. Lanza una Excepci�n si el Producto no se
	 * encuentra en el Cat�logo.
	 */
	public Boolean quitarProducto(Producto producto) throws ProductoNoEncontradoException {
		Boolean productoQuitado = false;
		if (!productos.contains(producto)) {
			productoQuitado = false;
			new ProductoNoEncontradoException("Producto sin stock");
		} else if (productos.contains(producto)) {
			productos.remove(producto);
			productoQuitado = true;
		}
		return productoQuitado;
	}

	/*
	 * Descuenta la cantidad deseada de producto del Stock.
	 */

	public HashSet<Producto> getProductos() {
		return productos;
	}

	public Boolean removerStock(Producto producto, Integer cantidad) throws ProductoNoEncontradoException {
		Integer cantidadEnStock = 0;
		for (Producto i : productos) {
			if (i.equals(producto)) {
				cantidadEnStock++;
			}
		}
		if (cantidadEnStock >= cantidad) {
			Integer vecesRemovido = cantidad;
			do {
				quitarProducto(producto);
				vecesRemovido--;
			} while (vecesRemovido == 0);
			return true;
		} else
			return false;
	}

	/*
	 * Devuleve la cantidad de Productos en existencia.
	 */
	public Integer obtenerCantidad(Producto producto) {
		Integer cantidad = 0;
		for (Producto i : productos) {
			if (i.equals(producto)) {
				cantidad++;
			}
		}
		return cantidad;
	}
}
