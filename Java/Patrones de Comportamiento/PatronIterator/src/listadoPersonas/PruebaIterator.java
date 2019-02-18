package listadoPersonas;

public class PruebaIterator {
	public static void main(String[] args) {
		
		SingleOutput out=SingleOutput.getImpresion();
		
		AgregadorPersonas personas=new AgregadorPersonas();
		
		personas.agregar("Juan Tequia");
		personas.agregar("Luis Salcedo");
		personas.agregar("Alejandro Bulla");
		personas.agregar("Daniel Castillo");
		
		
		Iterador iterador=personas.generarIterador(new IteradorAdelante(personas));
		
		out.imprimir(iterador.irHaciaFinal());
		out.imprimir(iterador.irHaciaInicio());
		out.imprimir(iterador.irHaciaSiguiente());
		out.imprimir(iterador.getActual());
		
		iterador=personas.generarIterador(new IteradorAtras(personas));
		
		out.imprimir(iterador.irHaciaFinal());
		out.imprimir(iterador.irHaciaInicio());
		out.imprimir(iterador.irHaciaSiguiente());
		out.imprimir(iterador.getActual());
		
		
		
	}
}
