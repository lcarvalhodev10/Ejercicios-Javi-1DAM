package interfaces_funcionales;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
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
	 01  (int s) -> { return s + 1; } // UnaryOperator<>
	 02  (int x, int y) -> { return x + y; } // BinaryOperator<>
	 03  () -> { System.out.println("Hola Mundo"); } // Runnable<>
	 04  (String s) -> { return s.isEmpty(); } // Predicate<>
	 05  (double d) -> { return d * 2.0; } // UnaruOperator<>
	 06  (int a, int b) -> { System.out.println(a - b); } //   BiConsumer<>
	 07  (String s1, String s2) -> { return s1.equals(s2); }   // BiPredicate<>
	 08  () -> {return 42;}  //  Supplier
	 09  (List<String> list) -> { return list.size(); }  // Function
	 10  (Map<String, Integer> map) -> { return map.isEmpty(); } //Predicate
	 11  (char c) -> { return Character.isDigit(c); }  //  
	 12  (String str) -> str.toUpperCase() // UnaryOperator
	 13  (String str) -> { return new StringBuilder(str).reverse().toString(); } // UnaryOperator
	 14  (boolean b) -> { return !b; } // UnarOperator o Predicate 
	 15  (String s, int n) -> { return s.substring(0, n); } // BiFunction
	 16  (int n, double d) -> { return Math.pow(n, d); } // UnaryOperator    */ 
	
	public static void main(String[] args) {
		UnaryOperator<Integer> suma = x -> x + 1; 
		
		
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
