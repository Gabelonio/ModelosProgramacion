package puntosinformacion;

public class PruebaFlyWeight {
	public static void main(String args[]) {
		GeneradorPtoInformacion generador=new GeneradorPtoInformacion();
		
		PuntoInformacion puntoUno=generador.crearPuntoInformacion("PuntoAzul");
		PuntoInformacion puntoDos=generador.crearPuntoInformacion("PuntoVerde");
		PuntoInformacion puntoTres=generador.crearPuntoInformacion("PuntoAzul");
		
		puntoUno.informar("Tienda de ropa");
		puntoDos.informar("Tienda de cosmeticos");
		puntoTres.informar("Tienda de deportes");
	}
}
