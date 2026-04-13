package boletin_colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * 	14) Define una clase Alumno con atributos nombre y nota.
	Ordena una lista de alumnos:
	1. Por nota en orden descendente.
	2. En caso de empate, por nombre en orden ascendente.

	15) Utilizando la lista anterior, muestra los tres alumnos con
	mejor nota después de ordenar.
 */
public class Alumno implements Comparable<Alumno>{
	private String nombre; 
	private int nota;
	
	public Alumno(String nombre, int nota) {
		this.nombre = nombre;
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNota() {
		return nota;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", nota=" + nota + "]";
	}

	@Override
	public int compareTo(Alumno a) {
		int comparacion = Integer.compare(a.nota, this.nota);
		if(comparacion == 0) comparacion = this.nombre.compareTo(a.nombre); 
		return comparacion;
	} 
	
	
	public static void main(String[] args) {
		List<Alumno> alumnos = new ArrayList<>();
		
		alumnos.add(new Alumno("Ana", 9)); 
		alumnos.add(new Alumno("Bea", 6)); 
		alumnos.add(new Alumno("Luana", 8)); 
		alumnos.add(new Alumno("Paula", 9)); 
		
		System.out.println(alumnos);
		
		Collections.sort(alumnos);
		
		System.out.println(alumnos);
		
		for (int i = 0; i < 3; i++) {
			System.out.println(alumnos.get(i));
		}
		
		
	}
	
	
	
	
}
