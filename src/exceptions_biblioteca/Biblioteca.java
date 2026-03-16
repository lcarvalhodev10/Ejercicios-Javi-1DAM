package exceptions_biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	List<Libro> libros;

	public Biblioteca() {
		libros = new ArrayList<Libro>();
	} 
	
	public void añadirLibro(Libro l) {
		libros.add(l); 
	}
	
	public void prestarLibro(String titulo) throws LibroYaPrestadoException, LibroNoExistenteException{
		for (Libro libro : libros) {
			if(libro.getTitulo().equals(titulo)) {
				if(libro.isPrestado()) {
					throw new LibroYaPrestadoException("El libro ya ha sido prestado.");
				} else {
					libro.prestar();
					System.out.println("Libro prestado con éxito: " + titulo);
					return; 
				}
			}
		}
		throw new LibroNoExistenteException("El libro solicitado no existe."); 
	}
	
	public void devolverLibro(String titulo) throws LibroNoPrestadoException {
		for (Libro libro : libros) {
			if(libro.getTitulo().equals(titulo) && libro.isPrestado()) {
					libro.devolver();
					System.out.println("Libro devolvido con éxito: " + titulo);
					return; 
			}
		}
		throw new LibroNoPrestadoException("Este libro libro no estaba prestado: " + titulo); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
