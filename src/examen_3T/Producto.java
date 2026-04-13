package examen_3T;

import java.util.Objects;
import java.util.Random;

public class Producto {
	private String nombre; 
	private Categoria categoria;
	private String fabricante; 
	private short añoLanzamiento; 
	private double precio; 
	private int id; 
	private static int nextID = 1000;
	private Random random = new Random(); 
	
	public Producto() {
		this.id = nextID++; 
		this.categoria = Categoria.values()[random.nextInt()];
		this.añoLanzamiento = (short)random.nextInt(2000, 2025);
		this.precio = (double)random.nextInt(10, 1000);
		String[] nombres = {"prod-1", "prod-2", "prod-3", "prod-4", "prod-5", "prod-6", "prod-7", "prod-8", "prod-9", "prod-10"}; 
		this.nombre = nombres[random.nextInt()];
		String[] fabricantes = {"fab-1", "fab-2", "fab-3", "fab-4", "fab-5", "fab-6", "fab-7", "fab-8", "fab-9", "fab-10"};
		this.fabricante = fabricantes[random.nextInt()];
		
		
	}

	@Override
	public String toString() {
		return "Producto [" + id + "] - " + categoria + fabricante + nombre; 
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

	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(añoLanzamiento, categoria, fabricante, nombre, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return añoLanzamiento == other.añoLanzamiento && categoria == other.categoria
				&& Objects.equals(fabricante, other.fabricante) && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
