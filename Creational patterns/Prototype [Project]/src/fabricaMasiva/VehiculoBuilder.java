package fabricaMasiva;

public class VehiculoBuilder {
	private Vehiculo vehiculo;

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void fabricarVehiculo() {
		vehiculo = new Vehiculo();
	} 
	
	public void fabricarRuedas(Rueda rueda,int cantidad) {
		vehiculo.setRueda(rueda);
		vehiculo.setCantidadRuedas(cantidad);
	}
	public void fabricarFaros(Faro faro) {
		vehiculo.setFaros(faro);
	}
	public void fabricarPlaca(Placa placa) {
		vehiculo.setPlaca(placa);
	}
	public void fabricarCapo(Capo capo) {
		vehiculo.setCapo(capo);
		
	}
	public void fabricarPuertas(int cantidadPuertas) {
		vehiculo.setCantidadPuertas(cantidadPuertas);
	}
	public void fabricarBaul(Baul baul) {
		vehiculo.setBaul(baul);
		
	}
	public void fabricarMotor(Motor motor) {
		vehiculo.setMotor(motor);
	}
	public void fabricarCarroceria(Carroceria carroceria) {
		vehiculo.setCarroceria(carroceria);;
	}
	
}
