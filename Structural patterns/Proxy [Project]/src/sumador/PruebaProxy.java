package sumador;

public class PruebaProxy {
	public static void main(String args[]) {
		Sujeto objSuma=new SujetoSumaProxy();
		SingleOutput consoleOut=SingleOutput.getImpresion();
		SingleInput consoleIn=SingleInput.getInsercion();
		consoleOut.imprimir("Ingrese los numeros a sumar");
		consoleOut.imprimir("Resultado : "+objSuma.sumar(consoleIn.insertar(),consoleIn.insertar()));
		
	}
}
