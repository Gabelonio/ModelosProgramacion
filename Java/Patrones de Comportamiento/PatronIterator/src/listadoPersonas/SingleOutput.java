package listadoPersonas;

public class SingleOutput {
	
	private static SingleOutput impresion; 
	private SingleOutput() {}
	
	public static SingleOutput getImpresion() {
		return (impresion==null)?impresion=new SingleOutput():impresion;
	}
	
	public void imprimir(Persona persona) {
		try {
			System.out.println(persona.getIdentificacion()+". "+
					persona.getNombre());
		}
		catch(NullPointerException ex) {
			System.out.println("Lista desbordada");
		}
	}
}
