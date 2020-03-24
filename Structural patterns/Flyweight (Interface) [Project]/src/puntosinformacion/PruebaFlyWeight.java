package puntosinformacion;

public class PruebaFlyWeight {
	public static void main(String args[]) {
		SingleOutput out=SingleOutput.getImpresion();
		GeneradorPtoInformacion generador=GeneradorPtoInformacion.getGeneradorPtoInformacion();
		
		InterfazPuntoInformacion puntoUno=generador.llamarPuntoInformacion("PuntoAzul");
		InterfazPuntoInformacion puntoDos=generador.llamarPuntoInformacion("PuntoVerde");
		InterfazPuntoInformacion puntoTres=generador.llamarPuntoInformacion("PuntoAzul");
		
		out.imprimir(puntoUno.informar("Tienda de ropa"));
		out.imprimir(puntoDos.informar("Tienda de cosmeticos"));
		out.imprimir(puntoTres.informar("Tienda de deportes"));
	}
}
