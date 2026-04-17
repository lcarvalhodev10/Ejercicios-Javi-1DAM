package examen_3T;

import java.util.Random;

public class Producto implements Comparable<Producto>{
	private static int nextID = 1_000;
	private static Random random = new Random(); 
	
	private int id; 
	private String nombre; 
	private Categoria categoria; 
	private String fabricante;
	private short añoLanzamiento; 
	private double precio;
	
	static String[] nombres = {"producto-1", "producto-2", "producto-3", "producto-4", "producto-5", "producto-6", "producto-7", "producto-8", "producto-9", "producto-10"}; 
	static String[] fabricantes = {"fabricante-1", "fabricante-2", "fabricante-3", "fabricante-4", "fabricante-5", "fabricante-6", "fabricante-7", "fabricante-8", "fabricante-9", "fabricante-10"}; 
	static Categoria[] categorias = Categoria.values();
	
	public Producto() throws PrecioInvalidoException{
		
		this.nombre = nombres[random.nextInt(nombres.length)];
		this.categoria = categorias[random.nextInt(categorias.length)];
		this.fabricante = fabricantes[random.nextInt(fabricantes.length)];
		this.añoLanzamiento = (short)random.nextInt(2000, 2025);
		this.precio = random.nextDouble(10.0, 1_000);
		
		if(categoria == categoria.ELECTRONICA && precio > 800) {
			throw new PrecioInvalidoException("Precios mayores de 800€ para eléctronicos no son permitidos"); 
		}
		this.id = nextID++; 
	}
	
	
	
	@Override
	public int compareTo(Producto p) {
		int comparacion = this.categoria.toString().compareTo(p.categoria.toString()); 
		if (comparacion == 0) comparacion =this.fabricante.compareTo(p.fabricante); 
		if (comparacion == 0) comparacion =  this.nombre.compareTo(p.nombre); 
		return comparacion;
	} 

	@Override
	public String toString() {
		return String.format("[%d] %s - %s: %s", id, categoria.toString().toUpperCase(), fabricante.toUpperCase(), nombre);
	}



	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public String getFabricante() {
		return fabricante;
	}

	public short getAñoLanzamiento() {
		return añoLanzamiento;
	}

	public double getPrecio() {
		return precio;
	}







	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
}
