package streams;

public class Book {
	/*
	 * map (book -> book.getAuthor())
	 * filter (author.getAge >= 50
	 * distinct
	 * limite(15)
	 * map(author::getSurname)
	 * map(String::toUpperCase)
	 * collect(toList())
	 */
	
	private Author author; 
	private String title;
	
	public Book(Author author, String titulo) {
		this.author = author;
		this.title = titulo;
	}

	public Author getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
