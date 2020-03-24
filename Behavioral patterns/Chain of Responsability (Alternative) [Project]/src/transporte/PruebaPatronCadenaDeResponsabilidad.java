package transporte;

public class PruebaPatronCadenaDeResponsabilidad {
	public static void main(String args[]) {
		
		SingleOutput out=SingleOutput.getImpresion();
		
		GestorTransporte PesoMayor=new GestorTransporte(5000,50);
		GestorTransporte PesoMediano=new GestorTransporte(1000,5,PesoMayor);
		GestorTransporte PesoMenor=new GestorTransporte(500,1,PesoMediano);
		
		out.imprimir(PesoMenor.manejarPeticion(15));
		
	}
}
