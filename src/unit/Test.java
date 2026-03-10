package unit;

public class Test {
	public static void main(String[] args) {
		Counter count = new Counter(); 
		
		count.show();
		System.out.println(count.increment()); 
		count.show();
		System.out.println(count.increment(2));
		count.show();
		System.out.println(count.reset());
	}
}
