package exceptions_jaula_y_pajaro;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jaula {
	private static int nextID = 1; 
	private int id; 
	private boolean puertaAbierta; 
	private int capacidad; 
	List<Pajaro> pajaros;
	
	
	public Jaula() {
		this.id = nextID++;
		this.puertaAbierta = false;
		Random random = new Random(); 
		this.capacidad = random.nextInt(3, 7);
		this.pajaros = new ArrayList<Pajaro>(capacidad); 
	}

	public boolean isPuertaAbierta() {
		return puertaAbierta;
	}

	public void setPuertaAbierta(boolean puertaAbierta) {
		this.puertaAbierta = puertaAbierta;
	}
	
	public int getCapacidad() {
		return capacidad;
	}

	public boolean addPajaro(Pajaro p) {
		if(p == null || pajaros.size() >= capacidad) {
			return false; 
		}
		return pajaros.add(p);
	}
	
	public Pajaro removePajaro() {
		if(pajaros.isEmpty()) return null; 
		return pajaros.remove(pajaros.size() -1); 
	}
	
	public int contarPajaros() {
		return pajaros.size(); 
	}
	
	public void cierraPuerta() {
		puertaAbierta = false;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.append("J-")
		.append(id)
		.append(" ")
		.append(pajaros)
		.toString(); 
	}
	
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
}
