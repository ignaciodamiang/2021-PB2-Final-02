package ar.edu.unlam.pb2.ordenes;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Orden {
	private Date fechaRecepcion;
	private Integer ID;
	private LinkedList<LineaOrden> lineasOrden;
	
	/*
	 * Se agrega un Item a la Orden
	 */
	public void agregarLinea(LineaOrden linea) {		
	}
	
	/*
	 * Se obtienen las Lineas de la Orden
	 */
	public List<LineaOrden> obtenerLineas() {
		return null;		
	}
		
	/*
	 * Devuelve el precio total de la Orden
	 */
	
	public Double obtenerPrecioTotal (){
		return null;
	}	
	
}
