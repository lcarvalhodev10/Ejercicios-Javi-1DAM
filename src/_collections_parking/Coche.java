package _collections_parking;

import java.util.Objects;
import java.util.Random;

/***
 * Representa un vehículo con atributos enum de marca y color.
 * Esta clase permite la creación de coches específicos o aleatorios.
 * 
 * <p>{@code toString()} devuelve marca y color de coche.</p>
 * @since 1.0
 */
public class Coche {
	private Marca marca; 
	private Color color;
	
	public Coche(Marca marca, Color color) {
		this.marca = marca;
		this.color = color;
	} 
	
	public Coche() {
		Marca[] marcas = Marca.values();
		Color[] colores = Color.values(); 
		Random random = new Random();
		
		this.marca = marcas[random.nextInt(marcas.length)];
		this.color = colores[random.nextInt(colores.length)];
	} 
	
	public String toString() {
		return String.format("Coche: %s %s", marca.name(), color.name());
	}

	public Marca getMarca() {
		return marca;
	}

	public Color getColor() {
		return color;
	}

	public int hashCode() {
		return Objects.hash(color, marca);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return color == other.color && marca == other.marca;
	}
	
	
	
	
}