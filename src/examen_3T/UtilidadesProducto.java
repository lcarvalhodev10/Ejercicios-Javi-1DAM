package examen_3T;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UtilidadesProducto {
	public static void main(String[] args) {
		try {
			List<Producto> productos = generaListaProductos(50);
		} catch (PrecioInvalidoException e) {
			e.getMessage();
		} 
		
		
	}
	
	
	public static List<Producto> generaListaProductos(int n) throws PrecioInvalidoException{
		List<Producto> resultado = new ArrayList<>(); 
		for (int i = 0; i < n; i++) {
			try {
				resultado.add(new Producto()); 
			} catch (PrecioInvalidoException e) {
				System.out.println(e.getMessage());
			}
		}
		return resultado;
	}
	
	public static List<Producto> filtradoAMedida(List<Producto> lista, Predicate<Producto> filtro){
		/*List<Producto>nuevaLista = lista.stream()
				.filter(filtro)
				.toList(); /*/
		
		return lista.stream().filter(filtro).toList();
	}
	
	public static void reportEntrePrecio(List<Producto> lista, double precioMin, double precioMax, boolean ordenDirecto) {
		List<Producto> listaFiltrada = lista.stream()
			.filter(p -> (p.getPrecio() >= precioMin && p.getPrecio() <= precioMax))
			.toList();
		
		List<Producto> listaFiltradaOrdenada = null; 
		
		if(ordenDirecto) {
			listaFiltradaOrdenada = listaFiltrada.stream()
								.sorted().toList(); 
		} else {
			listaFiltradaOrdenada = listaFiltrada.stream()
								.sorted((p1, p2) -> p2.compareTo(p1)).toList(); 
		}
		
		System.out.println("Listado de elementos ordenados");
		System.out.println("==============================");
		
		listaFiltradaOrdenada.forEach(p -> System.out.println(p + "[" + p.getPrecio() + "€]"));
		
		System.out.println("Productos listados: " + listaFiltradaOrdenada.stream().count());
		
		double suma = listaFiltradaOrdenada.stream()
				.map(p -> p.getPrecio())
				.reduce((double)0., (p1, p2) -> p1 + p2); 
		
		System.out.println("Precio medio: " + suma/listaFiltradaOrdenada.size());
		
	}
	
	public static void contarCaracteres(List<Producto> lista) {
		int caracteresNombre = lista.stream()
				.map(p -> p.getNombre().length())
				.reduce(0, (n1, n2) -> n1 + n2);
		
		int caracteresCategoria = lista.stream()
				.map(p -> p.getCategoria().toString().length())
				.reduce(0, (c1, c2) -> c1 + c2); 
		
		int caracteresFabricante = lista.stream()
				.map(p -> p.getFabricante().length())
				.reduce(0, (f1, f2) -> f1 + f2); 
		
		System.out.println("Total de caracteres de la lista");
		System.out.println("===============================");
		System.out.println("Caracteres de nombres: " + caracteresNombre);
		System.out.println("Caracteres de categoria " + caracteresCategoria);
		System.out.println("Caracteres de fabricante: " + caracteresFabricante);
	}
	
	public static List<Producto> productosUnicos(List<Producto> lista){		
		
		return lista.stream().distinct().toList();
	}
	
	public static Optional<Producto> productoIgual (List<Producto> lista, Producto producto){
		
		return lista.stream()
				.filter(p -> p.equals(producto))
				.findFirst(); 
	}
	
	public static Map<String, List<Producto>> agruparPorFabricante(List<Producto> lista){
		return lista.stream()
				.collect(Collectors.groupingBy(Producto::getFabricante)); 
	}
	
	public static double calcularValorInventario(List<Producto> lista) {
		return lista.stream()
				.map(p -> p.getPrecio())
				.reduce(0., (pre1, pre2) -> pre1 + pre1); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
