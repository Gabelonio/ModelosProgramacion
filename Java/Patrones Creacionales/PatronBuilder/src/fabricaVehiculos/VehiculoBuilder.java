package fabricaVehiculos;

public abstract class VehiculoBuilder {
	
	protected Vehiculo vehiculo;

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void fabricarVehiculo() {
		vehiculo = new Vehiculo();
	} 

	public abstract void fabricarRuedas();
	public abstract void fabricarFaros();
	public abstract void fabricarPlaca();
	public abstract void fabricarCapo();
	public abstract void fabricarPuertas();
	public abstract void fabricarBaul();
	public abstract void fabricarMotor();
	public abstract void fabricarCarroceria();
	
}
