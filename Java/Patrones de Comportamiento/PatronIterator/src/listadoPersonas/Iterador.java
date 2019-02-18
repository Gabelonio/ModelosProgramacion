package listadoPersonas;

public abstract class Iterador {
	
	protected AgregadorPersonas referencia;
	protected int posActual;
	
	public abstract boolean esFinal();
	public abstract Persona irHaciaSiguiente();
	public abstract Persona irHaciaInicio();
	public abstract Persona irHaciaFinal();
	
	public Persona getActual() {
		try {
			return referencia.registroPersonas.get(posActual);
		}
		catch(IndexOutOfBoundsException ex) {
			return null;  
		}
	}
	
}
