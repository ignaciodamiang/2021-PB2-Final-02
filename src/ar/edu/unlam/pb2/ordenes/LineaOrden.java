package ar.edu.unlam.pb2.ordenes;

public class LineaOrden {
	private Producto item;
	private Integer cantidad;

	/*
	 * Crea un Item en la Orden con un Producto y catidad especificados.
	 */
	public LineaOrden(Producto producto, Integer cantidad) {
		this.cantidad = cantidad;
		this.item = producto;
	}

	/*
	 * Informa el Subtotal del Item.
	 */
	public Double getSubtotal() {
		return item.getPrecioFinal() * this.cantidad;
	}

	/*
	 * Devuelve el Producto.
	 */
	public Producto getProducto() {
		return this.item;
	}

	/*
	 * Devuelve la cantidad.
	 */
	public Integer getCantidad() {
		return this.cantidad;
	}

	@Override
	public String toString() {
		return "LineaOrden [" + (item != null ? "item=" + item + ", " : "")
				+ (cantidad != null ? "cantidad=" + cantidad : "") + "]";
	}


}
