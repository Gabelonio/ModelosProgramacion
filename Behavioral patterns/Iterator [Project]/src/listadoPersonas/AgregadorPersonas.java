package listadoPersonas;

import java.util.ArrayList;

public class AgregadorPersonas extends Agregado{
	
	public ArrayList<Persona> registroPersonas;
	
	private int identificador;
	
	AgregadorPersonas(){
		registroPersonas=new ArrayList<Persona>();
		identificador=1;
	}


	@Override
	public void agregar(String nombre) {
		registroPersonas.add(new Persona(nombre,identificador));
		identificador+=1;
	}
	
	
}
