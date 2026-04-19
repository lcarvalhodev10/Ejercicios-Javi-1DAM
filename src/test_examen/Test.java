package test_examen;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		/*1-Crea una variable llamada lambda1a de tipo 
		Built-In Functional Interface compatible con la 
		versión simplificada de la expresión lambda () → 
		"Hola Mundo", y expresa la misma función lambda en 
		su formato completo (no simplificado) y asígnalo a una 
		variable que definirás llamada lambda1b.*/
		
		Supplier<String> lambda1a = () -> "Hola Mundo"; 
		Supplier<String> lambda1b = () -> { 
			return "Hola Mundo"; 
		};
		
		System.out.println(lambda1a.get());
		System.out.println(lambda1b.get());
		
		/* 2-Crea una variable llamada lambda2a de tipo 
		 * Built-In Functional Interface compatible con la versión 
		 * simplificada de la expresión lambda (a, b) → a + b, y 
		 * expresa la misma función lambda en su formato completo 
		 * (no simplificado) y asígnalo 
		 * a una variable que definirás llamada lambda2b.*/
		
		BiFunction<Integer, Integer, Integer> lambda2a = (a, b) -> a + b; 
		
		BiFunction<Integer, Integer, Integer> lambda2b = (Integer a, Integer b) -> { return a + b; }; 
		
		System.out.println(lambda2a.apply(3, 4));
		System.out.println(lambda2b.apply(3, 4)); 
	
		/* 3-Crea una variable llamada lambda3a de tipo Built-In
		 *  Functional Interface compatible con la versión simplificada 
		 *  de la expresión lambda str → str.length() > 5, y expresa 
		 *  la misma función lambda en su formato completo (no 
		 *  simplificado) y asígnalo a una variable que definirás 
		 *  llamada lambda3b.
		 */
	
		Predicate<String> lambda3a = str -> str.length() > 5; 
		Predicate<String> lambda3b = (String str) -> { return str.length() > 5; }; 
		
		System.out.println(lambda3a.test("hola"));
		System.out.println(lambda3b.test("hola"));
		
		/*4- Crea una variable llamada lambda4a de tipo Built-In 
		 * Functional Interface compatible con la versión simplificada 
		 * de la expresión lambda (x, y) → x.compareTo(y), y expresa 
		 * la misma función lambda en su formato completo (no 
		 * simplificado) y asígnalo a una variable que definirás 
		 * llamada lambda4b.*/
		
		BiFunction<String, String, Integer> lambda4a = (x, y) -> x.compareTo(y); 
		BiFunction<String, String, Integer> lambda4b = (String x, String y) -> { return x.compareTo(y); };
		
		System.out.println(lambda4a.apply("lula", "amanda"));
		 
		Comparator<String> lambda4c = (x, y) -> x.compareTo(y); 
		Comparator<String> lambda4d = (x, y) -> { return x.compareTo(y); };
		
		System.out.println(lambda4c.compare("Hola", "Tomas"));
		
		/*5-Crea una variable llamada lambda5a de tipo Built-In 
		Functional Interface compatible con la versión simplificada 
		de la expresión lambda lista -> lista.isEmpty(), y expresa 
		la misma función lambda en su formato completo (no 
				simplificado) y asígnalo a una variable 
		que definirás llamada lambda5b.*/
		
		Predicate<List<String>> lambda5a = lista -> lista.isEmpty(); 
		Predicate<List<String>> lambda5b = lista -> { return lista.isEmpty(); }; 
		
		
	}
}
