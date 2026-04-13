package examen_3T;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class UtilidadesProducto {
	
	public static void main(String[] args) {
	
	}
	
	
	public static void contarCaracteres(List<Producto> lista) {
		
		int caracteresNombre = lista.stream()
				.map(p -> p.getNombre().length())
				.reduce(0, (n1, n2) -> n1 + n2);
		
		int caracteresCategoria = lista.stream()
				.map(p -> p.getCategoria().toString().length())
				.reduce(0, (n1, n2) -> n1 + n2); 
		
		int caracteresFabricante = lista.stream()
				.map(p -> p.getFabricante().toString().length())
				.reduce(0, (n1, n2) -> n1 + n2); 
		
		System.out.println("Total de caracteres de la lista");
		System.out.println("===============================");
		System.out.println("Caracteres nombre: " + caracteresNombre);
		System.out.println("Caracteres categoria " + caracteresCategoria);
		System.out.println("Caracteres fabricante " + caracteresFabricante);	
	}
	
	public static List<Producto> productosUnicos(List<Producto> lista){
	
		return lista.stream().distinct().toList();
	}
	
	public static Optional<Producto> productoIgual(List<Producto> lista, Producto producto){
		
		return lista.stream()
			.filter(p -> p.equals(producto))
			.findFirst(); 
	}
	
	public static double calcularValorInventario(List<Producto> lista) {
		
		return lista.stream()
			.map(p -> p.getPrecio())
			.reduce(0., (pre1, pre2) -> pre1 + pre2); 
	}
	
	
	
	
	
	
	
	
	
	
	
}
