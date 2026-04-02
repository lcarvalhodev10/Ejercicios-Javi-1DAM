package boletin_colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 	Solicita al usuario una cantidad N de números enteros y
	almacénalos en un ArrayList<Integer>.
	Recorre la lista para calcular:
	● La suma total.
	● La media (como double).
	● El valor mínimo.
	● El valor máximo.
	No utilices métodos auxiliares de cálculo ya
	implementados.
 */
public class Uno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		List<Integer> lista = new ArrayList<>(); 
		
		for (int i = 5; i > 0; i--) {
			System.out.print("Introduzca un número: ");
			Integer número = sc.nextInt(); 
			lista.add(número);
		}

		int suma = 0; 
		int minimo = lista.getFirst(); 
		int maximo = lista.getFirst(); 
		for (Integer num : lista) {
			suma+= num;
			minimo = num < minimo ? num : minimo;  
			maximo = num > maximo ? num : maximo; 
		}
		double media = (double) suma / lista.size(); 
		
		System.out.println();
		System.out.println("La suma total es " + suma + ".");
		System.out.println("La media es " + media + ".");
		System.out.println("El valor mínimo es " + minimo + ".");
		System.out.println("El valor máximo es " + maximo + ".");
		
		
		
	}
}
