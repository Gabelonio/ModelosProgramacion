package papelera;

public class SingleOutput {
	
	private static SingleOutput impresion; 
	private SingleOutput() {}
	
	public static SingleOutput getImpresion() {
		return (impresion==null)?impresion=new SingleOutput():null;
	}
	
	public void imprimir(String mensaje) {
		System.out.println(mensaje);
	}
}
