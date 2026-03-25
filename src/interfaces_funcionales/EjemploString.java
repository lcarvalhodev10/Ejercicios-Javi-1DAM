package interfaces_funcionales;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploString {
	public static void main(String[] args) {
		
		DosString igual = (s1, s2) -> s1.equals(s2);
		DosString contiene = (s1, s2) -> s1.contains(s2);
		UnaString menorDeTres = s -> s.length() < 3 ;
		UnaString empiezaPorA = s -> s.startsWith("A"); 
		UnaString terminaPorPunto = s -> s.endsWith("."); 
		DosString empiezaPor = (s1, s2) -> s1.startsWith(s2); 
		
		System.out.println(igual.opera("Luana", "luana"));
		System.out.println(contiene.opera("Luana", "ana"));
		System.out.println(menorDeTres.opera("Paulo"));
		System.out.println(empiezaPorA.opera("Anabelle"));
		System.out.println(terminaPorPunto.opera("Hola."));
		System.out.println(empiezaPor.opera("Laura", "l"));
		
		BiPredicate<String, String> igual2 = (s1, s2) -> s1.equals(s2);
		BiPredicate<String, String> contiene2 = (s1, s2) -> s1.contains(s2); 
		Predicate<String> menorDeTres2 = s -> s.length() > 3; 
		Predicate<Character> empiezaPorA2 = s -> s.toString().startsWith("A"); 
		Predicate<Character> terminaPorPunto2 = s -> s.toString().endsWith(".");
		
		 
		
		
		
		
		
	}
	


}
