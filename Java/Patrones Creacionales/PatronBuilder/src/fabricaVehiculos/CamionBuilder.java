package fabricaVehiculos;

public class CamionBuilder extends VehiculoBuilder{
	@Override
	public void fabricarRuedas() {
		vehiculo.setRueda(new Rueda("GoodYear","Negro"));
		vehiculo.setCantidadRuedas(6);
	}
	@Override
	public void fabricarPlaca() {
		vehiculo.setPlaca(new Placa("Berlin","Alemania"));
	}

	@Override
	public void fabricarCapo() {
		vehiculo.setCapo(new Capo("Rojo",2.5,3));
	}

	@Override
	public void fabricarPuertas() {
		vehiculo.setCantidadPuertas(2);
	}

	@Override
	public void fabricarFaros() {
		vehiculo.setFaros(new Faro(20.5,2031));
		
	}
	@Override
	public void fabricarBaul() {
		vehiculo.setBaul(new Baul("Remolque",3,7.75));
		
	}
	@Override
	public void fabricarMotor() {
		vehiculo.setMotor(new Motor("40 HP","Ford"));
		
	}
	@Override
	public void fabricarCarroceria() {
		vehiculo.setCarroceria(new Carroceria("Acero","Gris"));
	}
}
