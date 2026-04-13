package comparable_ejemplo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
	public static void main(String[] args) {
		ArrayList<Alumno> alumnos = new ArrayList<>(); 
		alumnos.add(new Alumno("Pep", "1111A", 15));
		alumnos.add(new Alumno("Tom", "222A", 17));
		alumnos.add(new Alumno("Jon", "3333A", 14)); 
		alumnos.add(new Alumno("Tim", "5555A", 19));
		
		System.out.println(alumnos);
		
		/*Collections.sort(alumnos);
		System.out.println(alumnos);
		
		Collections.sort(alumnos);
		System.out.println(alumnos);*/
		
		Collections.sort(alumnos, new AlumnoPorEdadComparator());
		System.out.println("Alumnos ordenador por edad");
		System.out.println(alumnos);
		
		Collections.sort(alumnos, new AlumnoPorNiaComparator());
		System.out.println("Alumnos ordenado por NIA");
		System.out.println(alumnos);
		
		alumnos.sort(new Comparator<Alumno>() {
			@Override
			public int compare(Alumno a1, Alumno a2) {
				if(a1.getEdad() > a2.getEdad()) return 1; 
				if (a1.getEdad() < a2.getEdad()) return -1; 
				return a1.getNombre().compareTo(a2.getNombre());
			}
		});
		
		System.out.println(alumnos);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
