package _collections;


public class Test {

	public static void main(String[] args) {
		Coche c1 = new Coche();
		Coche c2 = new Coche();
		Coche c3 = new Coche(Marca.BM, Color.AM);
		Coche c4 = new Coche(Marca.BM, Color.AM);
		Parking park = new Parking("Puerta Jerez", 10);
		Parking p = new Parking("Alameda", 100);

		System.out.println(park.entraCoche(c2));
		System.out.println(park.entraCoche(c2));
		System.out.println(park.entraCoche(c3));
		System.out.println(park.entraCoche(c4));
		System.out.println(park.entraCoche(c1));
		park.reportParking();
		park.reportColores();
		park.reportMarca();
		park.reportCochesIguales();
		park.reportSetCoches();
		
		System.out.println(park.saleCoche(c2));
		park.reportColores();
		System.out.println(park.vaciarParking());
		
		for (int i = 0; i < 50; i++) {
			p.entraCoche(new Coche());
		}
		
		p.reportParking();
		p.reportColores();
		p.reportMarca();
		p.reportCochesIguales();
		p.reportSetCoches();
		
		for (int i = 0; i < 20; i++) {
			p.saleCocheAleatorio();
		}
		p.reportParking();
		p.reportColores();
		p.reportMarca();
		p.reportCochesIguales();
		p.reportSetCoches();
		
		
	}

}
