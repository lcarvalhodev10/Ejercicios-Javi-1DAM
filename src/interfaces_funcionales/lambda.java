package interfaces_funcionales;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class lambda {
	
	private static <T> void filtraDos(List<T> l, Predicate<T> p ) {
		for (int i = 0; i < l.size(); i++) {
			if(!(p.test(l.get(i)))) {
				l.remove(i);
			}
		}
	}

	/*
	 01  (int s) -> { return s + 1; } // 
	 02  (int x, int y) -> { return x + y; } // 
	 03  () -> { System.out.println("Hola Mundo"); } // 
	 04  (String s) -> { return s.isEmpty(); } // 
	 05  (double d) -> { return d * 2.0; } // 
	 06  (int a, int b) -> { System.out.println(a - b); } //   
	 07  (String s1, String s2) -> { return s1.equals(s2); }   // 
	 08  () -> {return 42;}  //  
	 09  (List<String> list) -> { return list.size(); }  // 
	 10  (Map<String, Integer> map) -> { return map.isEmpty(); } //
	 11  (char c) -> { return Character.isDigit(c); }  //  
	 12  (String str) -> str.toUpperCase() // 
	 13  (String str) -> { return new StringBuilder(str).reverse().toString(); } // 
	 14  (boolean b) -> { return !b; } //  
	 15  (String s, int n) -> { return s.substring(0, n); } // 
	 16  (int n, double d) -> { return Math.pow(n, d); } //    */ 
	
	public static void main(String[] args) {
		UnaryOperator<Integer> sumaUno = s -> s + 1;
		BinaryOperator<Integer> sumaNums = (x, y) -> x + y; 
		Runnable syso = () -> System.out.println("Hola Mundo");
		Predicate<String> estaVacio = s -> s.isEmpty(); 
		UnaryOperator<Double> multiplica = d -> d * 2.0; 
		BiConsumer<Integer, Integer> menos = (a, b) -> System.out.println(a - b);
		BiPredicate<String, String> esIgual = (s1, s2) -> s1.equals(s2); 
		Supplier<Integer> numero = () -> 42; 
		Function<List<String>, Integer> tamanioLista = list -> list.size(); 
		Predicate<Map<String, Integer>> mapaVacio = map -> map.isEmpty();
		Predicate<Character> tieneDigito = c -> Character.isDigit(c); 
		UnaryOperator<String> mayor = s -> s.toUpperCase(); 
		UnaryOperator<String> reverso = str -> new StringBuilder(str).reverse().toString(); 
		Predicate<Boolean> negacion = b -> !b; 
		BiFunction<String, Integer, String> subString = (t, u) -> t.substring(0, u);
		BiFunction<Integer, Double, Double> potencia = (t, u) -> Math.pow(t, u); 
		
		
		
		
		
		
		
		List<String> lista = new ArrayList<String>(); 
		lista.add("one"); 
		lista.add("two");
		lista.add("three");
		lista.add("four");
		lista.add("five");
		
		
		
		filtraDos(lista, (String s) -> s.length() > 3);
		filtraDos(lista, s -> s.length() > 10);
		
		lista.replaceAll(t -> t = "A");
		
		
		lista.forEach(t -> System.out.println(t));
		
		
		
		
		
		
	}
	

	
}
