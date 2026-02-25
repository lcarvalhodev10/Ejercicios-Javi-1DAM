package _collections;


public class Test {

	public static void main(String[] args) {
		Coche c1 = new Coche();
		Coche c2 = new Coche();
		Coche c3 = new Coche(Marca.BM, Color.AM);
		Coche c4 = new Coche(Marca.BM, Color.AM);
		Parking park = new Parking("Puerta Jerez", 10);
		
		park.reportParking();
		System.out.println(park.entraCoche(c2));
		System.out.println(park.entraCoche(c2));
		System.out.println(park.entraCoche(c3));
		System.out.println(park.entraCoche(c4));
		System.out.println(park.entraCoche(c1));
		park.reportParking();
		park.reportColores();
		park.reportMarca();
		park.reportCochesIguales();
		
		System.out.println(park.saleCoche(c2));
		park.reportColores();
		System.out.println(park.vaciarParking());
		park.reportParking();
		park.reportColores();
		park.reportMarca();
		park.reportCochesIguales();
		
		
		
		
	}

}
