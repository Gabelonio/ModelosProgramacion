package transporte;

public class PruebaPatronCadenaDeResponsabilidad {
	public static void main(String args[]) {
		SingleOutput out=SingleOutput.getImpresion();
		Transportador transportador=new Colectivo().setSiguiente(
										new CamionDeAlimentos().setSiguiente(
											new TractoCamion())); //Se crea la cadena de responsabilidad
		out.imprimir(transportador.transportar(new Carga("Personas")));
		out.imprimir(transportador.transportar(new Carga("Objetos")));
		out.imprimir(transportador.transportar(new Carga("Alimentos")));
	}
}
