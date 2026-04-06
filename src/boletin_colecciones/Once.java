package boletin_colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 * 	Dada una List<Integer>, elimina todos los números
	negativos utilizando un Iterator.
	No está permitido usar índices ni modificar la lista
	directamente dentro de un for-each
 */
public class Once {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>(Arrays.asList(1, -1, 3, -2, -4, 6, 3, -5));
		System.out.println(numeros);
		
		Iterator<Integer> it = numeros.iterator(); 
		
		while(it.hasNext()) {
			int n = it.next(); 
			if(n < 0) {
				it.remove();
			}
		}
		
		System.out.println(numeros);
		
		
	}
}
