package interfaces_funcionales;

interface _Predicate<T>{
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
}

public class EjemploBuilt_In {
	public static void main(String[] args) {
		

	}

}
