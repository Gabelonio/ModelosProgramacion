package fabricaSillas;

public class FabricaConcretaMMadera extends FabricaAbstracta{
	@Override
	EstructuraAbstracta construirEstructura() {
		EstructuraMadera estructura=new EstructuraMadera();
		System.out.println("Estructura de Madera creada con �xito");
		return estructura;
	}

	@Override
	RespaldoAbstracto construirRespaldo() {
		RespaldoMadera respaldo=new RespaldoMadera();
		System.out.println("Respaldo de Madera creado con �xito");
		return respaldo;
	}

	@Override
	SuperficieAbstracta construirSuperficie() {
		SuperficieMadera superficie=new SuperficieMadera();
		System.out.println("Superficie de Madera creada con �xito");
		return superficie;
	}
}
