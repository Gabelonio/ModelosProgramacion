package puntosinformacion;

public class PruebaFlyWeight {
	public static void main(String args[]) {
		GeneradorPtoInformacion generador=new GeneradorPtoInformacion();
		
		PuntoInformacion puntoUno=generador.llamarPuntoInformacion("PuntoAzul");
		PuntoInformacion puntoDos=generador.llamarPuntoInformacion("PuntoVerde");
		PuntoInformacion puntoTres=generador.llamarPuntoInformacion("PuntoAzul");
		
		puntoUno.informar("Tienda de ropa");
		puntoDos.informar("Tienda de cosmeticos");
		puntoTres.informar("Tienda de deportes");
	}
}
