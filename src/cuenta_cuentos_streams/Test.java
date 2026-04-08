package cuenta_cuentos_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		String cuento = CuentaCuentos.cuentoZorro();
		
		System.out.println(cuento);
		
		String[] cuentoSinEspacio = devuelvePalabras(cuento); 
		
		//arrayPalabras(cuentoSinEspacio);
		
		//arrayListPalabras(cuentoSinEspacio);
		
		//hashSetPalabras(cuentoSinEspacio);
				
		mapConteoPalabras(cuentoSinEspacio);
	

	}
	/*
	 * Limpia el texto (quita puntuación, saltos de línea) y devuelve un array de palabras sin vacíos.
	 */
	private static String[] devuelvePalabras(String texto) {
		// INICIAL
		texto = texto.replace(".", "").replace(",", "").replace("\n", " ");
		
		String[] arrayOriginal = texto.split(" ");
		
		
		/*// MANUAL CON FORs
		// cuenta palabras vacias y los nulls
		int contador = 0;
		for (String palabra : arrayOriginal) {
			if("".equals(palabra) || palabra == null) contador++;
		}
		
		// crea nuevo array
		String[] arrayResultado = new String[arrayOriginal.length - contador];
		
		// rellena nuevo array sin punto, coma o salto de linea
		int index = 0;
		for (String palabra : arrayOriginal) {
			if(!("".equals(palabra) || palabra == null)) {
				arrayResultado[index++] = palabra;
			}
		}		*/
		
		// OPTIMIZADO CON STREAM
		String[] resultado = Arrays.stream(arrayOriginal)
				.filter(p -> !(p.equals("") || p == null))
				.toArray(n -> new String[n]);
		
		// devulve array
		return resultado;
		
		// Obs: no hacia falta ni fors ni stream, solo devolver arrayOriginal
	}
	
	public static void arrayPalabras(String[] palabras) {
		System.out.println("ArraysPalabras");
		System.out.println("==============");
		
		Arrays.stream(palabras)
				.forEach(p -> System.out.println("[" + p + "]"));
		
		System.out.println();
		System.out.println("lista original tiene " + palabras.length + " palabras.");
	};
	
	public static void arrayListPalabras(String[] palabras) {
		
		//ArrayList<String> lista = new ArrayList<>();
		
		List<String> lista = Arrays.stream(palabras)
			.filter(p -> !(p.isEmpty()))
			.collect(Collectors.toList()); 
		
		// añade palabras si no esta vazio
		/*for(String palabra : palabras) {
			if (!palabra.isEmpty()) {
				lista.add(palabra);
			}
		}*/
		
		System.out.println("Arraylist de palabras");
		System.out.println("======================");
		
		// imprime 
		/*for(String palabra : lista) {
			System.out.println("["+ palabra + "]");
		}*/
		
		lista.stream()
			.forEach(p -> System.out.println("[" + p + "]"));
			
		
		System.out.println("Lista en ArrayList tiene "+lista.size()+" Palabras.");
		
	}
	

	public static void hashSetPalabras(String[] palabras) {
	    /*HashSet<String> conjunto = new HashSet<>();
	    for (String palabra : palabras) {
	        if (!palabra.isEmpty()) conjunto.add(palabra);
	    }*/
		
		Set<String> conjunto = Arrays.stream(palabras)
				.filter(p -> !(p.isEmpty()))
				.collect(Collectors.toSet());
	    
		
	    System.out.println("HashSet de palabras");
	    System.out.println("===================");

	    /*for (String palabra : conjunto) {
	        System.out.print("[" + palabra + "] ");
	    }*/
	    
	    conjunto.stream()
	    			.forEach(p -> System.out.println("[" + p + "]"));

	    System.out.println();
	    System.out.println("Lista en HashSet tiene " + conjunto.size() + " palabras.");
	    System.out.println();
	}
	

	public static void treeSetPalabras(String[] palabras) {
	    /*TreeSet<String> tree = new TreeSet<>();
	    for (String palabra : palabras) {
	        if (!palabra.isEmpty()) tree.add(palabra);
	    }*/
	    
	    TreeSet<String> tree = Arrays.stream(palabras)
	    				.filter(p -> !(p.isEmpty()))
	    				.collect(Collectors.toCollection(TreeSet::new));

	    System.out.println("TreeSet de palabras");
	    System.out.println("===================");

	    tree.stream()
	    		.forEach(p -> System.out.println("[" + p + "]"));

	    System.out.println();
	    System.out.println("Lista en TreeSet tiene " + tree.size() + " palabras.");
	    System.out.println();
	}
	

	public static void mapConteoPalabras(String[] palabras) {
	    /*Map<String, Integer> mapa = new HashMap<>();
	    for (String palabra : palabras) {
	        if (!palabra.isEmpty()) {
	            mapa.put(palabra, mapa.getOrDefault(palabra, 0) + 1);
	        }
	    }*/
	    
		Map<String, Integer> mapa = Arrays.stream(palabras)
					.filter(p -> !(p.isEmpty()))
					.collect(Collectors.toMap(p -> p, p -> 1, (e, n) -> e + n)); 
	    
	    
	    System.out.println("Conteo de repeticiones de palabras");
	    System.out.println("==================================");

	    /*for (String clave : mapa.keySet()) {
	        System.out.println("[" + clave + "(" + mapa.get(clave) + ")]");
	    }*/
	    
	    
	    mapa.entrySet().stream()
	    			.forEach(e -> System.out.println("[" + e.getKey() + "(" + e.getValue() + ")" + "]"));
	    
	    System.out.println();
	}

	
}