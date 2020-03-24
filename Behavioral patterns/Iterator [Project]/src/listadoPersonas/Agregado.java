package listadoPersonas;

public abstract class Agregado {
	public abstract void agregar(String nombre);
	public Iterador generarIterador(Iterador generacion) {
		return generacion; 
	}
}
