package fabricaSillas;

public class FabricaConcretaMAluminio extends FabricaAbstracta{

	@Override
	EstructuraAbstracta construirEstructura() {
		EstructuraAluminio estructura=new EstructuraAluminio();
		System.out.println("Estructura de Aluminio creada con éxito");
		return estructura;
	}

	@Override
	RespaldoAbstracto construirRespaldo() {
		RespaldoAluminio respaldo=new RespaldoAluminio();
		System.out.println("Respaldo de Aluminio creado con éxito");
		return respaldo;
	}

	@Override
	SuperficieAbstracta construirSuperficie() {
		SuperficieAluminio superficie=new SuperficieAluminio();
		System.out.println("Superficie de Aluminio creada con éxito");
		return superficie;
	}
	
}
