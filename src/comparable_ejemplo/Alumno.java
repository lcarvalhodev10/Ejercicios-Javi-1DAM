package comparable_ejemplo;


public class Alumno implements Comparable<Alumno>{
	private String nombre; 
	private String nia; 
	private int edad;
	
	public Alumno(String nombre, String nia, int edad) {
		this.nombre = nombre;
		this.nia = nia;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", nia=" + nia + ", edad=" + edad + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public String getNia() {
		return nia;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public int compareTo(Alumno a) {
		int comparacion = Integer.compare(this.edad, a.edad);
		if(comparacion == 0) comparacion = this.nombre.compareTo(a.nombre); 
		return comparacion;
	} 
	
	
}
