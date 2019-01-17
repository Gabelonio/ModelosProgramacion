package puntosinformacion;

public class PruebaFlyWeight {
	public static void main(String args[]) {
		GeneradorPtoInformacion generador=GeneradorPtoInformacion.getGeneradorPtoInformacion();
		
		InterfazPuntoInformacion puntoUno=generador.llamarPuntoInformacion("PuntoAzul");
		InterfazPuntoInformacion puntoDos=generador.llamarPuntoInformacion("PuntoVerde");
		InterfazPuntoInformacion puntoTres=generador.llamarPuntoInformacion("PuntoAzul");
		
		puntoUno.informar("Tienda de ropa");
		puntoDos.informar("Tienda de cosmeticos");
		puntoTres.informar("Tienda de deportes");
	}
}
