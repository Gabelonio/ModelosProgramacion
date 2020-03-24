package fabricaVehiculos;

public class CarroBuilder extends VehiculoBuilder{
	@Override
	public void fabricarRuedas() {
		vehiculo.setRueda(new Rueda("Pirelli","Verde"));
		vehiculo.setCantidadRuedas(4);
	}
	@Override
	public void fabricarPlaca() {
		vehiculo.setPlaca(new Placa("Bogota","Colombia"));
	}

	@Override
	public void fabricarCapo() {
		vehiculo.setCapo(new Capo("Magenta",1.25,2));
	}

	@Override
	public void fabricarPuertas() {
		vehiculo.setCantidadPuertas(4);
	}

	@Override
	public void fabricarFaros() {
		vehiculo.setFaros(new Faro(10.3,2025));
	}
	@Override
	public void fabricarBaul() {
		vehiculo.setBaul(new Baul("Familiar",1.5,1));
	}
	@Override
	public void fabricarMotor() {
		vehiculo.setMotor(new Motor("25 HP","Chevrolet"));
		
	}
	@Override
	public void fabricarCarroceria() {
		vehiculo.setCarroceria(new Carroceria("Aluminio","Azul"));
	}
}
