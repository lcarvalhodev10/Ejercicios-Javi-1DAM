package boletin_colecciones;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * 	Dadas dos listas de enteros ya ordenadas, crea una
	tercera lista ordenada combinando ambas sin volver a
	ordenar al final
 */
public class Dezesseis {
	
	public static class NumerosComparator implements Comparator<Integer>{
		@Override
		public int compare(Integer o1, Integer o2) {
			return o1.compareTo(o2);
		}
	}
	
	
	public static void main(String[] args) {
		List<Integer> numeros1 = Arrays.asList(2, 4, 7, 2, 8, 5); 
		List<Integer> numeros2 = Arrays.asList(2, 6, 7, 3, 5, 0); 
		
		System.out.println(numeros1);
		System.out.println(numeros2);
		
		Collections.sort(numeros2, new NumerosComparator());
		Collections.sort(numeros1, new NumerosComparator());
		
		System.out.println(numeros1);
		System.out.println(numeros2);
		
		
		
		
		
		
		
	}

}
