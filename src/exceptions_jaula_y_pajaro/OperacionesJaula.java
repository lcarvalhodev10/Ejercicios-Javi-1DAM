package exceptions_jaula_y_pajaro;

public class OperacionesJaula implements AutoCloseable{
	private Jaula jaula;

	public OperacionesJaula(Jaula jaula) throws JaulaNotAvailableException{
		if(jaula == null || jaula.isPuertaAbierta()) {
			throw new JaulaNotAvailableException("Jaula no disponible");
		}
		this.jaula = jaula; 
		jaula.setPuertaAbierta(true);
	} 
	
	public int contarPajaros() {
		return jaula.contarPajaros(); 
	}
	 public Pajaro metePajaro() throws EspacioInsuficienteException {
	        Pajaro p = new Pajaro();
	        if (!jaula.addPajaro(p)) {
	            throw new EspacioInsuficienteException("");
	        }
	        return p;
	 }
	
	public Pajaro sacaPajaro() {
		return jaula.removePajaro(); 
	}
	
	@Override
	public void close() {
		jaula.setPuertaAbierta(false);
		System.out.println("Puerta cerrada.");
	}
	
	
	
	
	
	
	
	
}
