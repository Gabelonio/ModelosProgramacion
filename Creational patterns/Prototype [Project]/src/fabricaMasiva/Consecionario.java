package fabricaMasiva;


public class Consecionario {
	private VehiculoBuilder ensamblador; 	
	
	public void construirVehiculo(Vehiculo modelo)
	{
		ensamblador=new VehiculoBuilder();
		ensamblador.fabricarVehiculo();
		ensamblador.fabricarBaul(modelo.getBaul());
		ensamblador.fabricarCapo(modelo.getCapo());
		ensamblador.fabricarCarroceria(modelo.getCarroceria());
		ensamblador.fabricarFaros(modelo.getFaros());
		ensamblador.fabricarMotor(modelo.getMotor());
		ensamblador.fabricarPlaca(modelo.getPlaca());
		ensamblador.fabricarPuertas(modelo.getCantidadPuertas());
		ensamblador.fabricarRuedas(modelo.getRueda(),modelo.getCantidadRuedas());
	}
	
	public Vehiculo getVehiculo() {
		return ensamblador.getVehiculo();
	}
}
