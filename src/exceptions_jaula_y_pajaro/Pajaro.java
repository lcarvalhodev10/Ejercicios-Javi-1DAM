package exceptions_jaula_y_pajaro;

public class Pajaro {
	private static int nextID = 1;
	private int id; 
	
	
	public Pajaro() {
		id = nextID++; 
	}

	public String toString() {
		return new StringBuilder()
				.append("P-")
				.append(id)
				.toString(); 	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
