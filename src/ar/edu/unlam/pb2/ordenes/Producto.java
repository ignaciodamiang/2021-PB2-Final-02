package ar.edu.unlam.pb2.ordenes;

public class Producto {
	private Integer numero;
	private String descripcion;
	private Double precio;

	/*
	 * Se crea un producto.
	 */
	public Producto(Integer numero, String descripcion, Double precio) {		
	}
	
	/*
	 * Retorna el precio unitario del Producto.
	*/
	public Double getPrecio() {
		return null;
	}
	
	/*
	 * Devulve el monto del impuesto.
	 * Todo producto tiene un 21% de impuesto.
	 */
	public Double getImpuesto() {
		return null;
	}
	
	/*
	 * Devuelve la descripción del Producto
	 */
	public String getDescripcion() {
		return this.descripcion;
	}
	
	/*
	 * Devuelve el precio del producto luego de aplicar el impuesto.
	 */
	public Double getPrecioFinal() {
		return null;
	}
}
