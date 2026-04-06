package boletin_colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Trece {
	public static void main(String[] args) {
		List<Integer> enteros = new ArrayList<>(Arrays.asList(1, 2, 2, 4, 4, 5, 5, 6, 7, 7));

		System.out.println(enteros);
		
		ListIterator<Integer> it = enteros.listIterator();
		
		while(it.hasNext()) {
			it.next(); 
			if(it.hasNext()) {
				it.add(0);
			}
		}
		System.out.println(enteros);

	}

}
