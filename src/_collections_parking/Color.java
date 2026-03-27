package _collections_parking;

/***
 * Enumeración que representa los colores disponibles para un coche.
 * 
 * <p> {@code toString()} devuelve el nombre legible en español</p>
 * 
 * @since 1.0
 */
public enum Color {
	RO("rojo"),
	NA("naranja"), 
	AM("amarillo"),
	VE("verde"),
	AZ("azul"),
	IN("índigo"),
	VI("violeta");
	
	private final String nombre;

	private Color(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return nombre;
	}
	
}
