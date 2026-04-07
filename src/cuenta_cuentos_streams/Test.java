package cuenta_cuentos_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		String cuento = CuentaCuentos.cuentoZorro();
		
		System.out.println(cuento);
		
		String[] cuentoSinEspacio = devuelvePalabras(cuento); 
		
		/*for (String string : cuentoSinEspacio) {
			System.out.println(string);
		}*/
		
		System.out.println(cuento);
		
	

	}

	private static String[] devuelvePalabras(String texto) {
		// antes
		texto = texto.replace(".", "").replace(",", "").replace("\n", " ");
		
		String[] arrayOriginal = texto.split(" ");
		
		Arrays.stream(arrayOriginal)
		
		int contador = 0;
		for (String palabra : arrayOriginal) {
			if("".equals(palabra) || palabra == null) contador++;
		}
		
		String[] arrayResultado = new String[arrayOriginal.length - contador];
		
		int index = 0;
		for (String palabra : arrayOriginal) {
			if(!("".equals(palabra) || palabra == null)) {
				arrayResultado[index++] = palabra;
			}
		}		
		
		return arrayResultado;
	}
	
	public static void arrayPalabras(String[] palabras) {
		System.out.println("ArraysPalabras");
		System.out.println("==============");
		
		for(String palabra : palabras) {
			System.out.print("["+ palabra + "]");
			
		}
		System.out.println();
		System.out.println("lista original tiene" + palabras.length + "palabras.");
	};
	
	public static void arrayListPalabras(String[] palabras) {
		
		ArrayList<String> lista = new ArrayList<>();
		
		for(String palabra : palabras) {
			if (!palabra.isEmpty()) {
				lista.add(palabra);
			}
		}
		
		System.out.println("Arraylist de palabras");
		System.out.println("======================");
		
		for(String palabra : lista) {
			System.out.println("["+ palabra + "]");
			
		}
		
		
		System.out.println("Lista en ArrayList tiene"+lista.size()+"Palabras.");
		
	}
	

	public static void hashSetPalabras(String[] palabras) {
	    HashSet<String> conjunto = new HashSet<>();
	    for (String palabra : palabras) {
	        if (!palabra.isEmpty()) conjunto.add(palabra);
	    }

	    System.out.println("HashSet de palabras");
	    System.out.println("===================");

	    for (String palabra : conjunto) {
	        System.out.print("[" + palabra + "] ");
	    }

	    System.out.println();
	    System.out.println("Lista en HashSet tiene " + conjunto.size() + " palabras.");
	    System.out.println();
	}
	

	public static void treeSetPalabras(String[] palabras) {
	    TreeSet<String> tree = new TreeSet<>();
	    for (String palabra : palabras) {
	        if (!palabra.isEmpty()) tree.add(palabra);
	    }

	    System.out.println("TreeSet de palabras");
	    System.out.println("===================");

	    for (String palabra : tree) {
	        System.out.print("[" + palabra + "] ");
	    }

	    System.out.println();
	    System.out.println("Lista en TreeSet tiene " + tree.size() + " palabras.");
	    System.out.println();
	}
	

	public static void mapConteoPalabras(String[] palabras) {
	    Map<String, Integer> mapa = new HashMap<>();
	    for (String palabra : palabras) {
	        if (!palabra.isEmpty()) {
	            mapa.put(palabra, mapa.getOrDefault(palabra, 0) + 1);
	        }
	    }

	    System.out.println("Conteo de repeticiones de palabras");
	    System.out.println("==================================");

	    for (String clave : mapa.keySet()) {
	        System.out.println("[" + clave + "(" + mapa.get(clave) + ")]");
	    }
	    System.out.println();
	}

	
}