package exceptions_vector;

public class Vector {
	private int x;
	private int y;
	
	public Vector(int x, int y) {
		this.x = x;
		this.y = y;
	} 
	
	public Vector(int n) {
		this(n, n); 
	} 
	
	public String toString() {
		return String.format("Vector [x= %d, y= %d]",
				x, y);
	}
	
	public Vector sumar(Vector v) throws VectorOutOfBoundsException {
		if((long)x + v.x > Integer.MAX_VALUE ||
		   (long)x + v.x < Integer.MIN_VALUE ||
		   (long)y + v.y > Integer.MAX_VALUE ||
		   (long)y + v.y < Integer.MIN_VALUE) {
			throw new VectorOutOfBoundsException("La suma no se puede realizar"); 
		}
		return new Vector(x + v.x, y + v.y);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
