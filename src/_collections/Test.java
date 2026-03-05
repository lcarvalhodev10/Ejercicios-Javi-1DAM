package _collections;

/***
 * Clase para pruebas de funcionamiento de parking 
 */
public class Test {
	public static void main(String[] args) {
		Coche c1 = new Coche(Marca.BM, Color.AM); 
		Coche c2 = new Coche(Marca.BM, Color.AM); 
		Parking p0 = new Parking("Puerta Jerez", 20);
		Parking p1 = new Parking("Alameda", 25);
		Parking p2 = new Parking("Atlantic", 30);

		System.out.println(p0.entraCoche(c2));
		System.out.println(p0.entraCoche(c1));
		for (int i = 0; i < 15; i++) {
			p0.entraCoche(new Coche());	
			p2.entraCoche(new Coche());
		}
		
		/*p.reportParking();
		p.reportColores();
		p.reportMarcas();
		p.reportCochesIguales();
		p.reportSetCoches();*/
		
		//p.saleCocheAleatorio();
		//System.out.println(p.saleCoche(c2));
		//System.out.println(p.saleCoche(c1));
		//p.vaciarParking();
		
		
		p0.reportParking();
		p1.reportParking();
		p0.reportColores();
		p1.reportColores();
		System.out.println(p0.transladarParking(p1));
		System.out.println("-----------------------");
		p0.reportParking();
		p1.reportParking();
		p0.reportColores();
		p1.reportColores();
		
		
		System.out.println(p0.moverCoche(c2, p2));
		System.out.println(p0.moverCoche(c1, p2));
		p0.reportParking();
		p2.reportParking();
		p0.reportColores();
		p2.reportColores();
		
		p0.reportMapaParkings();
		p0.reportContadorPlazasOcupadas();
			
	}

}
