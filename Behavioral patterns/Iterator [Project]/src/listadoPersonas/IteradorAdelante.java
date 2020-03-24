package listadoPersonas;

public class IteradorAdelante extends Iterador{
	
	IteradorAdelante(AgregadorPersonas recepcion){
		this.referencia=recepcion;
		this.posActual=0; 
	}

	@Override
	public boolean esFinal() {
        return (posActual+1)==referencia.registroPersonas.size();
	}

	@Override
	public Persona irHaciaSiguiente() {
		posActual+=1;
		try {
			return this.getActual();
		}
		catch(IndexOutOfBoundsException ex) {
			posActual-=1;
			return null;  
		}
	}

	@Override
	public Persona irHaciaInicio() {
		posActual=0;
		return this.getActual();
	}

	@Override
	public Persona irHaciaFinal() {
		posActual=referencia.registroPersonas.size()-1;
		return this.getActual();
	}

}
