package _collections_parking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/***
 * Responsable de gestionar entradas y salidas de coches de parking a través de
 * listas y mapas.
 * 
 * @author luana
 * @version 1.0
 */
public class Parking {
	private String nombre;
	private int totalPlazas;
	private static Random random = new Random();
	// Lista de coches
	private List<Coche> listaCoches;
	// Contador de colores de coches
	private Map<Color, Integer> contadorColor;
	// Contador de marcas de coches
	private Map<Marca, Integer> contadorMarca;
	// Contador de tipos de coches
	private Map<Coche, Integer> contadorCochesIguales;
	// Set de tipos de coches
	private Set<Coche> setCoches;
	// Contador de Plazas totales
	private static Map<Parking, Integer> mapaParkings = new HashMap<>();
	// Contador de Plazas ocupadas
	private static Map<Parking, Integer> contadorPlazasOcupadas = new HashMap<>();
	// Número de parkings
	private static int numeroParkings = 0;

	public Parking(String nombre, int totalPlazas) {
		this.nombre = nombre;
		this.totalPlazas = totalPlazas;

		listaCoches = new ArrayList<Coche>();
		contadorColor = new HashMap<>();
		contadorMarca = new HashMap<>();
		contadorCochesIguales = new HashMap<>();

		mapaParkings.put(this, this.totalPlazas);
		contadorPlazasOcupadas.put(this, 0);
		
		numeroParkings++;
	}

	/***
	 * Gestiona entrada de coches especificos en parking.
	 * 
	 * @param c Coche asignado para entrar en parking
	 * @return puedeEntrar si es posible adicionarlo a lista
	 */
	public boolean entraCoche(Coche c) {
		boolean hayPlazas = listaCoches.size() < totalPlazas;
		// verificar si ya esta dentro
		boolean estaDentro = false;
		for (Coche coche : listaCoches) {
			if (coche == c) {
				estaDentro = true;
				break;
			}
		}
		// si no hay plazas y ya no estaba dentro se puede entrar
		boolean puedeEntrar = hayPlazas && !estaDentro;

		
		if (puedeEntrar) {
			// adiciona a lista
			listaCoches.add(c);
			
			// actualiza mapa de plazas ocupadas
			contadorPlazasOcupadas.put(this, contadorPlazasOcupadas.get(this) + 1);

			// actualiza mapa de colores
			Color color = c.getColor();
			Integer elementoColor = contadorColor.get(color);
			contadorColor.put(color, elementoColor == null ? 1 : elementoColor + 1);

			// actualiza mapa de marcas
			Marca marca = c.getMarca();
			Integer elementoMarca = contadorMarca.get(marca);
			contadorMarca.put(marca, elementoMarca == null ? 1 : elementoMarca + 1);

			// actualiza mapa de coches iguales
			Integer elementoCochesIguales = contadorCochesIguales.get(c);
			contadorCochesIguales.put(c, elementoCochesIguales == null ? 1 : elementoCochesIguales + 1);
		}

		return puedeEntrar;
	}

	/***
	 * Gestiona salida de coches especificos del parking..
	 * 
	 * @param c Coche asignado para salir del parking
	 * @return estaDentro si es posible removerlo de lista
	 */
	public boolean saleCoche(Coche c) {
		boolean estaVacio = listaCoches.isEmpty();
		boolean estaDentro = false;
		for (Coche coche : listaCoches) {
			if (coche == c) {
				estaDentro = true;
			}
		}
		if (!estaDentro || estaVacio)
			return false;

		// remove de lista
		listaCoches.remove(c);

		// actualiza mapa de colores
		Color color = c.getColor();
		Integer elementoColor = contadorColor.get(color);
		if (elementoColor > 1) {
			contadorColor.put(color, elementoColor - 1);
		} else {
			contadorColor.remove(color);
		}

		// actualiza mapa de marcas
		Marca marca = c.getMarca();
		Integer elementoMarca = contadorMarca.get(marca);
		if (elementoMarca > 1) {
			contadorMarca.put(marca, elementoMarca - 1);
		} else {
			contadorMarca.remove(marca);
		}

		// actualiza mapa de coches iguales
		Integer elementoCocheIgual = contadorCochesIguales.get(c);
		if (elementoCocheIgual == 1) {
			contadorCochesIguales.remove(c);
		} else {
			contadorCochesIguales.put(c, elementoCocheIgual - 1);
		}

		// actualiza mapa de plazas ocupadas
		contadorPlazasOcupadas.put(this, contadorPlazasOcupadas.get(this) + 1);

		return estaDentro;
	}

	/***
	 * Gestiona salidas de coches aleatorios del parking.
	 * 
	 * @return salida de coche aleatorio si no esta vacio.
	 */
	public boolean saleCocheAleatorio() {
		if (listaCoches.isEmpty())
			return false;

		int indiceAleatorio = random.nextInt(listaCoches.size());
		Coche cocheAleatorio = listaCoches.get(indiceAleatorio);
		// sale coche de lista y mapas
		return saleCoche(cocheAleatorio);

	}

	/***
	 * Vacia el Parking.
	 * 
	 * @return true si es ya no estaba vacio.
	 */
	public boolean vaciarParking() {
		if (listaCoches.isEmpty())
			return false;

		while (!(listaCoches.isEmpty())) {
			saleCocheAleatorio();
		}
		return true;
	}

	/***
	 * Translada coches de un parking a otro
	 * 
	 * @param p Parking al que se translada coches de parking seleccionado
	 * @return true si se puede transladar
	 */
	public boolean transladarParking(Parking p) {
		// verificar si hay sitio suficiente en parking p y si parking llamado no está
		// vacio
		boolean haySitioEnP = p.totalPlazas - p.listaCoches.size() >= listaCoches.size();
		boolean estaVacioParkAntes = listaCoches.isEmpty();
		boolean sePuedeTransladar = haySitioEnP && !estaVacioParkAntes;
		// añade listado en parking p y lo remove de parking anterior
		if (!sePuedeTransladar)
			return false;
		// copia para no tocar la original mientras iteramos
		List<Coche> copia = new ArrayList<>(listaCoches);
		for (Coche coche : copia) {
			p.entraCoche(coche);
			saleCoche(coche);
		}
		return true;
	}

	/***
	 * Mueve un coche de un parking a otro
	 * 
	 * @param c coche que se translada
	 * @param p Parking al que se translada coches de parking seleccionado
	 * @return
	 */
	public boolean moverCoche(Coche c, Parking p) {
		// verifica si hay plaza en parking p para añadir nuevo coche
		boolean haySitioEnP = p.totalPlazas - p.listaCoches.size() >= 1;
		// verifica si coche c esta dentro de parking anterior
		boolean estaDentro = false;
		for (Coche coche : listaCoches) {
			if (coche == c) {
				estaDentro = true;
				break;
			}
		}
		boolean puedeMoverCoche = haySitioEnP && estaDentro;
		// si no pasa por verificación retorna false;
		if (!puedeMoverCoche)
			return false;
		// añade coche a nueva lista, remove de lista anterior
		p.entraCoche(c);
		saleCoche(c);
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
		System.out.printf("Total coches: %d, plazas libres: %d.%n", listaCoches.size(),
				totalPlazas - listaCoches.size());
	}

	/***
	 * Información de cantidad de colores de coche en parking.
	 */
	public void reportColores() {
		System.out.println("LISTADO DE COLORES");
		System.out.println("------------------");
		System.out.println("Parking: " + nombre);

		for (Map.Entry<Color, Integer> entry : contadorColor.entrySet()) {
			Color color = entry.getKey();
			Integer cantidadColor = entry.getValue();

			System.out.printf("El coche de color %s se repite %d ve%s.%n", color, cantidadColor,
					cantidadColor > 1 ? "ces" : "z");
		}

		System.out.printf("Total coches: %d.%n", listaCoches.size());
	}

	/***
	 * Información de cantidad de marcas de coches en parking.
	 */
	public void reportMarcas() {
		System.out.println("LISTADO DE MARCAS");
		System.out.println("-----------------");
		System.out.println("Parking: " + nombre);
		for (Map.Entry<Marca, Integer> entry : contadorMarca.entrySet()) {
			Marca marca = entry.getKey();
			Integer cantidad = entry.getValue();
			System.out.printf("El coche de marca %s se repite %d ve%s.%n", marca, cantidad, cantidad > 1 ? "ces" : "z");
		}
		System.out.printf("Total coches: %d.%n", listaCoches.size());
	}

	/***
	 * Información de cantidad de tipos de coches
	 */
	public void reportCochesIguales() {
		System.out.println("LISTADO DE COCHES IGUALES");
		System.out.println("-------------------------");
		System.out.println("Parking: " + nombre);

		for (Map.Entry<Coche, Integer> entry : contadorCochesIguales.entrySet()) {
			Coche coche = entry.getKey();
			Integer cantidad = entry.getValue();
			System.out.printf("Coche: %s %s se repite %d ve%s.%n", coche.getMarca().name(), coche.getColor().name(),
					cantidad, cantidad > 1 ? "ces" : "z");
		}

		System.out.printf("Total coches: %d.%n", contadorCochesIguales.size());
	}

	/***
	 * Información de tipos de coches en parking
	 */
	public void reportSetCoches() {
		System.out.println("LISTADO SET DE COCHES");
		System.out.println("---------------------");
		System.out.println("Parking: " + nombre);
		setCoches = contadorCochesIguales.keySet();

		for (Coche coche : setCoches) {
			System.out.printf("Coche: %s %s%n", coche.getMarca().name(), coche.getColor().name());
		}

		System.out.println("Total coches: " + setCoches.size());
	}

	public void reportMapaParkings() {
		System.out.println("LISTADO PARKINGS");
		System.out.println("-------------------------------");

		for (Map.Entry<Parking, Integer> entry : mapaParkings.entrySet()) {
			Parking park = entry.getKey();
			Integer totalPlazas = entry.getValue();
			System.out.printf("Parking: %s - plazas totales: %d.%n", park.nombre, totalPlazas);
		}

		System.out.println("Total de parkings: " + mapaParkings.size() + ".");
	}

	public void reportContadorPlazasOcupadas() {
		System.out.println("LISTADO PLAZAS OCUPADAS PARKINGS");
		System.out.println("--------------------------------");
		
		for (Map.Entry<Parking, Integer> entry : contadorPlazasOcupadas.entrySet()) {
			Parking park = entry.getKey();
			Integer plazaOcupadas = entry.getValue();
			if(!(plazaOcupadas == 0)) {
				System.out.printf("Parking: %s tiene %d plazas ocupadas.%n", park.nombre, plazaOcupadas);
			}
			
		}

		System.out.println("Total de parkings: " + mapaParkings.size() + ".");
	}

}
