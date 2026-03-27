package interfaces_funcionales;

import java.time.LocalDate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/*interface _Predicate<T>{
	boolean test(T t); 
}

interface _BiPredicate<T, U>{
	boolean test(T t, U u); 
}

interface _Consumer<T>{
	void accept(T t); 
}

interface _BiConsumer<T, U>{
	void accept(T t, U u);
}

interface _Function<T, R>{
	R apply(T t); 
}

interface _BiFunction<T, U, R>{
	R apply(T t, U u);
}

interface _UnaryOperator<T>{
	T apply(T t); 
}

interface _BinaryOperator<T>{
	T apply(T t1, T t2); 
}

interface _Supplier<T>{
	T get(); 
}*/

interface EntraCuatroEnterosSaleEntero {
	int operaVariable(int x, int a, int b, int c); 
}

public class EjemploBuilt_In {
	
	private static int sumaArray(int[] array, IntPredicate condition) {
		int suma = 0; 
		
		for (int num : array) {
			if(condition.test(num)) {
				suma += num; 
			}
		}
		return suma; 
	}
	
	public static void main(String[] args) {
		UnaryOperator<Integer> cuadrado = x -> x * x; 
		UnaryOperator<Integer> cubo = x -> x * x * x; 
		UnaryOperator<Integer> doble = x -> x * 2;
		UnaryOperator<Integer> triple = x -> x * 3; 
		UnaryOperator<Integer> polinomio = x -> 5 * (cubo.apply(x)) + 7 * (cuadrado.apply(x)) + 9; 
		EntraCuatroEnterosSaleEntero polinomioVariable = (x, a, b, c) -> a * (x * x * x) + b * (x * x) + c; 
		
		UnaryOperator<Integer> mitad = x -> x / 2; 
		UnaryOperator<Integer> cuartaParte = x -> x / 4; 
		UnaryOperator<Integer> decimaParte = x -> x / 10; 
		BinaryOperator<Integer> n_simaParte = (x, p) -> x / p; 
		sumaArray(new int[] {1, 2, 3}, x -> true); 
		sumaArray(new int[] {1, 2, 3}, x -> x % 2 == 0); 
		sumaArray(new int[] {1, 2, 3}, x -> x > 0); 
		sumaArray(new int[] {1, 2, 3}, x -> x < 0);
		sumaArray(new int[] {1, 2, 3}, x -> x > 100);
		sumaArray(new int[] {1, 2, 3}, x -> x > 2); 
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	}

}
