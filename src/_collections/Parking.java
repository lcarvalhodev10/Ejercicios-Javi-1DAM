package _collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/***
 * Responsable de gestionar coches con la creación de parking.
 * A través de listas y mapas se gestiona entradas y salidas de parking.
 * 
 * @author luana
 * @version 1.0
 */
public class Parking {
	private String nombre; 
	private int totalPlazas;
	// Lista de coches
	private List<Coche> listaCoches = new ArrayList<>();
	// Contador de colores de coches
	private Map<Color, Integer> contadorColor = new HashMap<>();
	private Map<Marca, Integer> contadorMarca = new HashMap<>();
	private Map<Coche, Integer> contadorCochesIguales = new HashMap<>();
	private static Random random = new Random();
	
	public Parking(String nombre, int totalPlazas) {
		this.nombre = nombre;
		this.totalPlazas = totalPlazas;
	}
	
	/***
	 * Gestiona entrada de coches especificos en parking.
	 * @param c Coche asignado para entrar en parking
	 * @return true si es posible adicionarlo a lista
	 */
	public boolean entraCoche(Coche c) {
		if(listaCoches.size() < totalPlazas && ! listaCoches.contains(c)){
			// adiciona a lista
			listaCoches.add(c);
			
			// actualiza mapa de colores
			Color color = c.getColor();
			Integer elementoColor = contadorColor.get(color);
			if(contadorCochesIguales.containsKey(c)) {
				contadorCochesIguales.put(c, contadorCochesIguales.get(c) + 1);
			} else {
				contadorCochesIguales.put(c, 1);
			}
			
			// actualiza mapa de marcas
			Marca marca = c.getMarca();
			Integer elementoMarca = contadorMarca.get(marca);
			contadorMarca.put(marca, elementoMarca == null ? 1 : elementoMarca + 1);
			
			// actualiza mapa de coches iguales
			if(contadorCochesIguales.containsKey(c)) {
				contadorCochesIguales.put(c, contadorCochesIguales.get(c) + 1);
			} else {
				contadorCochesIguales.put(c, 1);
			}
			
			return true;
		}
		return false;
	}
	
	/***
	 * Gestiona salida de coches especificos del parking..
	 * @param c Coche asignado para salir del parking
	 * @return true si es posible removerlo de lista
	 */
	public boolean saleCoche(Coche c) {
		if(!(listaCoches.contains(c)) || listaCoches.isEmpty()) {
			return false; 
		}
		// remove de lista
		listaCoches.remove(c);
		// actualiza mapa de colores
		Color color = c.getColor();
		Integer elementoColor = contadorColor.get(color);
		/*contadorColor.put(color, elementoColor -1 );
		if(elementoColor == 0) contadorColor.remove(color);*/
		if(elementoColor == 1) {
			contadorColor.remove(color);
		} else {
			contadorColor.put(color, elementoColor -1 );
		}
		
		// actualiza mapa de marcas
		Marca marca = c.getMarca();
		Integer elementoMarca = contadorMarca.get(marca);
		if(elementoMarca == 1) {
			contadorMarca.remove(marca);
		}
		else {
			contadorMarca.put(marca, elementoMarca - 1);
		}
		
		// actualiza mapa de coches iguales
		Integer elementoCocheIgual = contadorCochesIguales.get(c);
		if(elementoCocheIgual >= 1) {
			contadorCochesIguales.remove(c);
		} else {
			contadorCochesIguales.put(c, elementoCocheIgual - 1);
		}
		
		return true; 
	}
	
	/***
	 * Gestiona salidas de coches aleatorios del parking. 
	 * @return salida de coche aleatorio si no esta vacio.
	 */
	public boolean saleCocheAleatorio() {
		if(listaCoches.isEmpty()) return false;

		int indiceAleatorio = random.nextInt(listaCoches.size());
		Coche cocheAleatorio = listaCoches.get(indiceAleatorio);
		// sale coche de lista y mapas
		return saleCoche(cocheAleatorio);
		
	}
	
	/***
	 * Vacia el Parking.
	 * @return true si es ya no estaba vacio.
	 */
	public boolean vaciarParking() {
		if(listaCoches.isEmpty()) return false;
		
		while(!(listaCoches.isEmpty())) {
			saleCocheAleatorio();
		}
		return true;
	}
	
	/***
	 * Información de listado de coches en parking.
	 */
	public void reportParking() {
		System.out.println("LISTADO COCHES");
		System.out.println("--------------");
		System.out.println("Parking: " + nombre);
		
		for (Coche coche : listaCoches) {
			System.out.printf("Coche: %s %s%n", coche.getMarca().name(), coche.getColor().name());
		}
		System.out.printf("Total coches: %d, plazas libres: %d.%n", listaCoches.size(), totalPlazas - listaCoches.size());
	}
	
	/***
	 * Información de cantidad de colores de coche en parking.
	 */
	public void reportColores() {
		System.out.println("LISTADO DE COLORES");
		System.out.println("--------------");
		System.out.println("Parking: " + nombre);
		
		for (Map.Entry<Color, Integer> entry : contadorColor.entrySet()) {
			Color color = entry.getKey();
			Integer cantidadColor = entry.getValue();
			
			System.out.printf("El coche de color %s se repite %d ve%s.%n",
					color, cantidadColor, cantidadColor > 1 ? "ces" : "z");
		}
		
		
		System.out.printf("Total coches: %d.%n", listaCoches.size());
	}
	
	/***
	 * Información de cantidad de marcas de coches en parking.
	 */
	public void reportMarca() {
		System.out.println("LISTADO DE MARCAS");
		System.out.println("--------------");
		System.out.println("Parking: " + nombre);
		for (Map.Entry<Marca, Integer> entry : contadorMarca.entrySet()) {
			Marca marca = entry.getKey();
			Integer cantidad = entry.getValue();
			System.out.printf("El coche de marca %s se repite %d ve%s.%n",
					marca, cantidad, cantidad > 1 ? "ces" : "z");
		}
		System.out.printf("Total coches: %d.%n", listaCoches.size());
	}
	
	public void reportCochesIguales() {
		System.out.println("LISTADO DE COCHES IGUALES");
		System.out.println("--------------");
		System.out.println("Parking: " + nombre);
		
		for (Map.Entry<Coche, Integer> entry : contadorCochesIguales.entrySet()) {
			Coche coche = entry.getKey();
			Integer cantidad = entry.getValue();
			System.out.printf("Coche: %s %s se repite %d ve%s.%n",
					coche.getMarca().name(), coche.getColor().name(), cantidad, cantidad > 1 ? "ce" : "z");
		}
		
		System.out.printf("Total coches: %d.%n", listaCoches.size());
	}
	
	
	
	
	
	
}
