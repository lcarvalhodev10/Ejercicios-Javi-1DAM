package _collections;

/***
 * Enumeración que representa las marcas disponibles para un coche.
 * 
 * <p> {@code toString()} devuelve el nombre legible en español</p>
 * 
 * @since 1.0
 * 
 */
public enum Marca {
	WV("Volkswagen"), 
	TO("Toyota"), 
	BM("BMW"), 
	ME("Mercedes-Benz"), 
	HY("Hyundai");
	
	private final String nombre;

	private Marca(String nombre) {
		this.nombre = nombre;
	} 
	
	public String toString() {
		return nombre;
	}
}
