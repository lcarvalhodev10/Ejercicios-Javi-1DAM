package interfaces_funcionales;

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
		 
		
	}
	


}
