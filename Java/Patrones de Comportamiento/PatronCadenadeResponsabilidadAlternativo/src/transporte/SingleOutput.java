package transporte;

public class SingleOutput {
	
	private static SingleOutput impresion; 
	private SingleOutput() {}
	
	public static SingleOutput getImpresion() {
		return (impresion==null)?impresion=new SingleOutput():impresion;
	}
	
	public void imprimir(String mensaje) {
		System.out.println(mensaje);
	}
}
