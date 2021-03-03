package ar.edu.unlam.pb2.ordenes;

@SuppressWarnings("serial")
public class ProductoNoEncontradoException extends Exception {
	public ProductoNoEncontradoException(String mensaje) {
		super(mensaje);
	}
}
