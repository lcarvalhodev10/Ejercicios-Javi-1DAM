package interfaces_funcionales;

public class EjemploEnteros {
	
	private int cuadradoMetodo(int x) {
		return x * x;
	}
	
	private int cuboMetodo(int x) {
		return x * x * x; 
	}
	
	private int dobleMetodo(int x) {
		return x * 2; 
	}
	
	private int tripleMetodo(int x) {
		return x * 3; 
	}
	
	private int polinomioMetodo(int x) {
		return 5 * cuboMetodo(x) + 7 * cuadradoMetodo(x) + 9; 
	}
	
	private int polinomioVariableMetodo(int x, int a, int b, int c) {
		return a * cuboMetodo(x) + b * cuadradoMetodo(x) + c; 
	}
	
	// Ejercicio 2 : cálculo de arrays
	private static int sumaArray(int[] array, CalculoArrays funcionValidadora) {
		int suma = 0; 
		
		for (int num : array) {
			if(funcionValidadora.evaluate(num)) {
				suma += num;
			}
		}
		return suma; 
	}
	
	
	public static void main(String[] args) {
		// Ejemplo con clase 
		System.out.println("-----------");
		System.out.println("Ejemplo con clase");
		System.out.println("-----------");
		
		EjemploEnteros ej = new EjemploEnteros(); 
		
		System.out.println(new EjemploEnteros().cuadradoMetodo(5));
		System.out.println(ej.cuboMetodo(6));
		System.out.println(ej.dobleMetodo(8));
		System.out.println(ej.tripleMetodo(10));
		System.out.println(ej.polinomioMetodo(2));
		System.out.println(ej.polinomioVariableMetodo(5, 2, 3, 4));
		
		// Reformulado con interfaces funcionales: 
		System.out.println("-----------");
		System.out.println("Reformulado con interfaces funcionales");
		System.out.println("-----------");
		
		// Interfaz EntraEnteroSaleEntero
		EntraEnteroSaleEntero cuadradoIF = (int p) ->{return p * p;};
		EntraEnteroSaleEntero cuboIF = p -> p * p * p;
		EntraEnteroSaleEntero dobleIF = p -> p * 2; 
		EntraEnteroSaleEntero tripleIF = p -> p* 3; 
		EntraEnteroSaleEntero polimonioIF = p -> 5 * cuboIF.opera(p) + 7 * cuadradoIF.opera(p) + 9;
		// Interfaz Entra4EnterosSale4Enteros
		EntraCuatroEnterosSaleEntero polinomioVariableIF = (p, a, b, c) -> a * cuboIF.opera(p) + b * cuadradoIF.opera(p) + c; 		
		
		System.out.println(cuadradoIF.opera(5));
		System.out.println(cuboIF.opera(6));
		System.out.println(dobleIF.opera(8));
		System.out.println(tripleIF.opera(10));
		System.out.println(polimonioIF.opera(2));
		System.out.println(polinomioVariableIF.operaVariable(5, 2, 3, 4));
		
		// Ejercicio 2: calculo de mitades
		System.out.println("-----------");
		System.out.println("Ejercicio 2: cálculo de mitades");
		System.out.println("-----------");
		
		
		CalcularPartes mitad = x -> x / 2.; 
		CalcularPartes cuartaParte = x -> x / 4.; 
		CalcularPartes decimaParte = x -> x / 10.; 
		CalcularParteEspecifica n_simaParte = (x, p) -> (double)x / p; 
		
		Object[] funciones = {mitad, cuartaParte, decimaParte, n_simaParte};
		
		for (Object funcion : funciones) {
			if(funcion instanceof CalcularPartes) {
				System.out.println(((CalcularPartes)funcion).calcula(5));
			} else {
				System.out.println(((CalcularParteEspecifica)funcion).calculaEspecifico(5, 2));
			}
		}
		
		/*System.out.println(mitad.calcula(5));
		System.out.println(cuartaParte.calcula(2));
		System.out.println(decimaParte.calcula(9));
		System.out.println(n_simaParte.calculaEspecifico(5, 2));*/
		
		System.out.println("-----------");
		System.out.println("Ejercicio 2: cálculo de arrays");
		System.out.println("-----------");
		
		// Ejercicio 2 - calculo de arrays
		
		System.out.println("CALCULO CON ARRAY");
		System.out.println("-----------------");
		
		System.out.println(sumaArray(new int[] {1, 2, 3}, x -> true));
		System.out.println(sumaArray(new int[] {1, 2, 3}, x -> x % 2 == 0));
		System.out.println(sumaArray(new int[] {1, 2, 3}, x -> x %  2 != 0));
		System.out.println(sumaArray(new int[] {1, 2, 3}, x -> x > 0));
		System.out.println(sumaArray(new int[] {-1, 2, -3}, x -> x < 0));
		System.out.println(sumaArray(new int[] {1, 200, 300}, x -> x > 100));
		System.out.println(sumaArray(new int[] {1, 2, 3}, x -> x > 2));		
		
		
		
			
		  
		
	}
	
	
	
	
	
	
	
	
}
