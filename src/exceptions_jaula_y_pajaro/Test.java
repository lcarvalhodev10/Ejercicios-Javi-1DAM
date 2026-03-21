package exceptions_jaula_y_pajaro;

public class Test {
	public static void main(String[] args) {
		Jaula j1 = new Jaula(); 
		Pajaro p1 = new Pajaro(); 
		Pajaro p2 = new Pajaro(); 
		
		try (OperacionesJaula operaciones = new OperacionesJaula(j1)){
			 System.out.println(operaciones.metePajaro());
			 System.out.println(operaciones.metePajaro());
			 
			 System.out.println(j1);
			 
			 Pajaro sacado = operaciones.sacaPajaro();
			 System.out.println("Sacado: " + sacado);
			 
			 System.out.println(j1);
			 
			 for (int i = 0; i < 8; i++) {
				 System.out.println(operaciones.metePajaro());
			}
			 
		} catch (JaulaNotAvailableException e) {
			System.out.println(e.getMessage());
		} catch (EspacioInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}
}
