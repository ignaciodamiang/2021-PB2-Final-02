package ar.edu.unlam.pb2.ordenes;

import java.util.Set;

/*
 * Mantiene una colección de Productos, los cuales no pueden
 * estar duplicados. Además, por cada Producto se desea mantener 
 * la cantidad del mismo en Stock,
 */
public class Catalogo {
	
	/*
	 * ¿Cuál es la colección adecuada?
	 */
	
	
	
	/*
	 * Agregar producto al catálogo.
	 * No se permiten Productos duplicados. Criterio: número de Producto. 
	 */
	public Boolean agregarProducto(Producto producto, Integer cantidad) {
		return null;
		
	}
	
	/*
	 * Remueve Producto del Catálogo.
	 * Lanza una Excepción si el Producto no se encuentra en el Catálogo.
	 */
	public Boolean quitarProducto(Producto producto) {
		return null;		
	}
	
	/*
	 * Descuenta la cantidad deseada de producto del Stock.
	 */
	
	public Boolean removerStock(Producto producto, Integer cantidad) {
		return null;
	}
	
	/*
	 * Devuleve la cantidad de Productos en existencia.
	 */
	public Integer obtenerCantidad(Producto producto) {
		return null;
	}
}
