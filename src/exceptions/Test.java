package exceptions;

public class Test {
	public static void main(String[] args) {
		Vector vec1 = new Vector(2, 4); 
		Vector vec2 = new Vector(4, 6);
		
		try {
			System.out.println(vec1.sumar(vec2));
		} catch(VectorOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Fin del programa");
	}
}
