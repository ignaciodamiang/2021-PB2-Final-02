package ar.edu.unlam.pb2.ordenes;

/*
 * Es un tipo "especial" de Producto.
 */

public class ProductoDeLujo extends Producto {
	Double precioEspecial = 0.0;

	ProductoDeLujo(Integer numero, String descripcion, Double precio) {
		super(numero, descripcion, precio);
		this.precioEspecial = this.getPrecioFinal() * 1.15;
	}
	/*
	 * Se le aplica el 21% y un 15% de impuesto adicional por derechos de
	 * importaci�n.
	 */

	@Override
	public Double getImpuesto() {
		return this.precioEspecial - this.getPrecio();
	}
}
