package exceptions_jaula_y_pajaro;

import java.util.ArrayList;
import java.util.List;

public class Jaula {
	private int id; 
	private static int nextdID = 1;
	
	private boolean puertaAbierta; 
	private int capacidad; 
	
	private List<Pajaro> pajaros; 

	public Jaula(boolean puertaAbierta, int capacidad) {
		this.puertaAbierta = puertaAbierta;
		this.capacidad = capacidad;
		pajaros = new ArrayList<Pajaro>();
		id = nextdID++; 
	}

	@Override
	public String toString() {
		return "Jaula-" + id + " [capacidad=" + capacidad +  "]";
	}
	
	

	 
	
	
	
	
	
	
	
	
	
	
	
	
	
}
