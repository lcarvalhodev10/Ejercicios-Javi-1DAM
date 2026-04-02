package boletin_colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * 	Crea una nueva lista que contenga los mismos elementos
	que la original, pero en orden inverso.
	No utilices Collections.reverse
 */
public class Cuatro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		List<Integer> lista = new ArrayList<>(); 
		
		for (int i = 5; i > 0; i--) {
			System.out.print("Introduzca un número: ");
			Integer número = sc.nextInt(); 
			lista.add(número);
		}
		
		System.out.println(lista);
		
		List<Integer> nuevaLista = new ArrayList<>(); 
		
		for (int i = lista.size() - 1; i >= 0; i--) {
			nuevaLista.add(lista.get(i)); 
		}
		
		System.out.println(nuevaLista);
	}
}
