package _collections;

/***
 * Clase para pruebas de funcionamiento de parking 
 */
public class Test {
	public static void main(String[] args) {
		Coche c1 = new Coche(Marca.BM, Color.AM); 
		Coche c2 = new Coche(Marca.BM, Color.AM); 
		Parking p = new Parking("Puerta Jerez", 20);
		
		System.out.println(p.entraCoche(c2));
	
		System.out.println(p.entraCoche(c1));
		for (int i = 0; i < 15; i++) {
			p.entraCoche(new Coche());			
		}
		
		p.reportParking();
		p.reportColores();
		p.reportMarcas();
		p.reportCochesIguales();
		p.reportSetCoches();
		
		p.saleCocheAleatorio();
		System.out.println(p.saleCoche(c2));
		System.out.println(p.saleCoche(c1));
		p.vaciarParking();
		
		p.reportParking();
		p.reportColores();
		p.reportMarcas();
		p.reportCochesIguales();
		p.reportSetCoches();
		
		
	}

}
