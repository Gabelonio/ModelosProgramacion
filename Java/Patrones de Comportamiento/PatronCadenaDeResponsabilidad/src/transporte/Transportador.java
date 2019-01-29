package transporte;

public abstract class Transportador {
	
	protected Transportador siguiente;
	
	public Transportador setSiguiente(Transportador sucesor){
		siguiente=sucesor;           //se apunta al siguiente que realice la responsabilidad
		return this;				 //se retorna a el mismo con la referencia hecha
	}
	
	/*
	 * Responsabilidad especifica para cada clase
	 */
	public abstract String transportar(Carga carga);
	
}
