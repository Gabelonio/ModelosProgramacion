package listadoPersonas;

public class Persona {
	private int identificacion;
	private String nombre; 
	
	Persona(String nombre,int identificacion){
		this.nombre=nombre;
		this.identificacion=identificacion;
	}
	
	public int getIdentificacion() {
		return identificacion;
	}

	public String getNombre() {
		return nombre;
	}

}
