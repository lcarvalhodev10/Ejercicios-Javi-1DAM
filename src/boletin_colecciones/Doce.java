package boletin_colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/*
 * Dada una lista de cadenas, sustituye todas las cadenas
	vacías por el texto "(vacío)" utilizando un ListIterator.

 */
public class Doce {
	public static void main(String[] args) {
		List<String> cadenas = new ArrayList<>(Arrays.asList("a", "","b", "","c", "","d", "","e"));
		
		System.out.println(cadenas);
		
		ListIterator<String> it = cadenas.listIterator(); 
		
		while(it.hasNext()) {
			String s = it.next(); 
			if(s.equals("")) {
				it.set("(vacio)");
			}
		}
		
		System.out.println(cadenas);
		
		
	}
}
