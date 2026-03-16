package exceptions_biblioteca;

public class Libro {
	private String titulo; 
	private boolean prestado;
	
	public Libro(String titulo) {
		this.titulo = titulo;
		this.prestado = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public boolean isPrestado() {
		return prestado;
	} 
	
	public void prestar() throws LibroYaPrestadoException{
		if(prestado) {
			throw new LibroYaPrestadoException("El libro ya está prestado."); 
		}
		prestado = true; 
	}
	
	public void devolver() throws LibroNoPrestadoException {
		if(!prestado) {
			throw new LibroNoPrestadoException("El libro no fue prestado."); 
		}
		prestado = false; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
