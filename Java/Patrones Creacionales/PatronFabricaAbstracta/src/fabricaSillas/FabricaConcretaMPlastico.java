package fabricaSillas;

public class FabricaConcretaMPlastico extends FabricaAbstracta{
	@Override
	EstructuraAbstracta construirEstructura() {
		EstructuraPlastico estructura=new EstructuraPlastico();
		System.out.println("Estructura de Plastico creada con éxito");
		return estructura;
	}

	@Override
	RespaldoAbstracto construirRespaldo() {
		RespaldoPlastico respaldo=new RespaldoPlastico();
		System.out.println("Respaldo de Plastico creado con éxito");
		return respaldo;
	}

	@Override
	SuperficieAbstracta construirSuperficie() {
		SuperficiePlastico superficie=new SuperficiePlastico();
		System.out.println("Superficie de Plastico creada con éxito");
		return superficie;
	}
}
