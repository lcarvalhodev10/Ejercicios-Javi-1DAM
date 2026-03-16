package exceptions_biblioteca;

public class Test {

	public static void main(String[] args) {
		Biblioteca b1 = new Biblioteca(); 
		Libro l1 = new Libro("Portada"); 
		Libro l2 = new Libro("Amanecer");
		Libro l3 = new Libro("Carrossel"); 
		
		b1.añadirLibro(l3);
		b1.añadirLibro(l2);
		b1.añadirLibro(l1);
		
		
		try {
			b1.prestarLibro("Portada");
		} catch(LibroNoExistenteException e) {
			System.out.println(e.getMessage());
		} catch(LibroYaPrestadoException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			b1.devolverLibro("Portada");
		} catch(LibroNoPrestadoException e) {
			System.out.println(e.getLocalizedMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
