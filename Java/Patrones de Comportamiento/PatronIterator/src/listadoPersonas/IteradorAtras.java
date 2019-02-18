package listadoPersonas;

public class IteradorAtras extends Iterador{
	
	IteradorAtras(AgregadorPersonas recepcion){
		this.referencia=recepcion;
		this.posActual=(referencia.registroPersonas.size()-1); 
	}

	@Override
	public boolean esFinal() {
		
        return 0==referencia.registroPersonas.size();
	}

	@Override
	public Persona irHaciaSiguiente() {
		posActual-=1; 
		try {
			return this.getActual();
		}
		catch(IndexOutOfBoundsException ex) {
			posActual+=1;
			return null;  
		}
	}

	@Override
	public Persona irHaciaInicio() {
		posActual=referencia.registroPersonas.size()-1;
		return this.getActual();
	}

	@Override
	public Persona irHaciaFinal() {
		posActual=0; 
		return this.getActual();
	}

}
