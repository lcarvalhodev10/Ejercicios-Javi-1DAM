package streams;

import java.util.ArrayList;
import java.util.List;

public class TestLibrary {
	public static void main(String[] args) {
		
		// 5 autores
        Author austen    = new Author("Jane", "Austen", 53, Gender.FEMALE);
        Author tolkien   = new Author("J.R.R.", "Tolkien", 72, Gender.MALE);
        Author garcia    = new Author("Gabriel", "García Márquez", 41,Gender.MALE);
        Author rowling   = new Author("J.K.", "Rowling", 62, Gender.FEMALE);
        Author cervantes = new Author("Miguel de", "Cervantes", 49, Gender.MALE);

        // Lista de autores
        List<Author> autores = new ArrayList<>();
        autores.add(austen);
        autores.add(tolkien);
        autores.add(garcia);
        autores.add(rowling);
        autores.add(cervantes);

        // 10 libros
        List<Book> library = new ArrayList<>();
        library.add(new Book(austen, "Orgullo y Prejuicio")); 
        library.add(new Book(austen, "Emma")); 
        library.add(new Book(tolkien, "El Señor de los Anillos")); 
        library.add(new Book(tolkien, "El Hobbit")); 
        library.add(new Book(garcia, "Cien Años de Soledad")); 
        library.add(new Book(garcia, "El Amor en los Tiempos del Cólera")); 
        library.add(new Book(rowling, "Harry Potter y la Piedra Filosofal")); 
        library.add(new Book(rowling, "Harry Potter y la Cámara Secreta")); 
        library.add(new Book(cervantes, "Don Quijote (Parte I)")); 
        library.add(new Book(cervantes, "Don Quijote (Parte II)")); 
        
        
        library.stream()
        		.map(b -> b.getAuthor())
        		.distinct()
        		.filter(author -> author.getGender() == Gender.FEMALE)
        		.filter(author -> author.getAge() >= 50)
        		.forEach(a -> System.out.println(a.getName() + " " + a.getSurname()));
        	
        		
       
        
        
        
        
        
        
        
        
	}
}
