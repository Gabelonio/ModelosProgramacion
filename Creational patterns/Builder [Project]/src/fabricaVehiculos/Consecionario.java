package fabricaVehiculos;

public class Consecionario {
	
	private VehiculoBuilder ensamblador; 	
	
	public void construirVehiculo()
	{
		ensamblador.fabricarVehiculo();
		ensamblador.fabricarBaul();
		ensamblador.fabricarCapo();
		ensamblador.fabricarCarroceria();
		ensamblador.fabricarFaros();
		ensamblador.fabricarMotor();
		ensamblador.fabricarPlaca();
		ensamblador.fabricarPuertas();
		ensamblador.fabricarRuedas();
	}
	
	public VehiculoBuilder getEnsamblador() {
		return ensamblador;
	}
	
	public void setEnsamblador(VehiculoBuilder ensamblador) {
		this.ensamblador = ensamblador;
	}
}
