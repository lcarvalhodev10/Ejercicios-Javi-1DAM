package boletin_colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * 	Dada una lista y un número entero k, rota sus elementos
	hacia la derecha k posiciones.
	El valor de k puede ser mayor que el tamaño de la lista.
	El resultado debe almacenarse en una nueva lista.

 */
public class Cinco {
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
		int k = 2; 
		
		k = k % lista.size(); 
		
		List<Integer> nuevaLista = new ArrayList<Integer>();
		
		for (int i = lista.size() - k ; i < lista.size(); i++) {
			nuevaLista.add(lista.get(i)); 
		}
		
		for (int i = 0; i < lista.size() - k ; i++) {
			nuevaLista.add(lista.get(i)); 
		}
		
		System.out.println(lista);
		System.out.println(nuevaLista);
		
		
		
		
		
		
		
		
		
		
	}
}
