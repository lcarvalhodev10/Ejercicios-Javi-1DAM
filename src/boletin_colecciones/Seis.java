package boletin_colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Seis {
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1, 3, 5, 2, 3, 4, 5, 1);
		List<Integer> nuevaLista = new ArrayList<Integer>(); 
		Set<Integer> unicos = new HashSet<Integer>(); 
		
		for (Integer numero : lista) {
			if(!unicos.contains(numero)) {
				unicos.add(numero); 
				nuevaLista.add(numero); 
			}
		}
		
		System.out.println(lista);
		System.out.println(nuevaLista);
		
	}
}
