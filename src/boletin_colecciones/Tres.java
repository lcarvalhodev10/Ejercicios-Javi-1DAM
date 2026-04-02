package boletin_colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 	Dada una lista de enteros, crea una nueva lista copiando
	los elementos uno a uno mediante un bucle.
	No utilices el constructor copia ni addAll.
 */
public class Tres {
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
		
		for (Integer numero : lista) {
			nuevaLista.add(numero); 
		}
		
		System.out.println(nuevaLista);
		
		
		
		
		
	}
}
