package ar.edu.unlam.pb2.ordenes;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Orden {
	private Date fechaRecepcion;
	private Integer ID;
	private LinkedList<LineaOrden> lineasOrden;

	public Orden(Date fechaRecepcion, Integer ID) {
		this.lineasOrden = new LinkedList<LineaOrden>();
		this.fechaRecepcion = fechaRecepcion;
		this.ID = ID;
	}

	/*
	 * Se agrega un Item a la Orden
	 */
	public void agregarLinea(LineaOrden linea) {
		lineasOrden.add(linea);
	}

	/*
	 * Se obtienen las Lineas de la Orden
	 */
	public List<LineaOrden> obtenerLineas() {
		return lineasOrden;
	}

	/*
	 * Devuelve el precio total de la Orden
	 */

	public Double obtenerPrecioTotal() {
		Double precioTotal = 0.0;
		for (LineaOrden i : lineasOrden) {
			precioTotal = precioTotal + i.getSubtotal();
		}
		;
		return precioTotal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Orden))
			return false;
		Orden other = (Orden) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		return true;
	}

	public Date getFechaRecepcion() {
		return fechaRecepcion;
	}

}
