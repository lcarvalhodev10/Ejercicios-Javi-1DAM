package boletin_colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 	Dada una List<String> con varias palabras, crea una
	nueva lista que contenga únicamente las palabras cuya
	longitud sea mayor o igual que 5 caracteres.
	La lista original no debe modificarse.
 */
public class Dos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		List<String> lista = new ArrayList<>();
		
		for (int i = 5; i > 0; i--) {
			System.out.print("Introduzca una palabra: ");
			String palabra = sc.nextLine();  
			lista.add(palabra);
		}
		
		
		List<String> listaDeMenores = new ArrayList<>(); 
		
		for (String p : lista) {
			if(p.length() >= 5) {
				listaDeMenores.add(p); 
			}
		}
		
		System.out.println("Las palabras con 5 letras o más son: " + listaDeMenores);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
