package fabricaMasiva;

public class Vehiculo {
	private Rueda rueda;
	private int cantidadRuedas; 
	private Capo capo;
	private Baul baul;
	private Carroceria carroceria;
	private Faro faros;
	private Motor motor;
	private Placa placa; 
	private int cantidadPuertas;
	
	Vehiculo()
	{
	}
	Vehiculo(Vehiculo vehiculo)
	{
		this.setRueda(vehiculo.getRueda());
		this.setCantidadRuedas(vehiculo.getCantidadRuedas());
		this.setCapo(vehiculo.getCapo());
		this.setBaul(vehiculo.getBaul());
		this.setCarroceria(vehiculo.getCarroceria());
		this.setFaros(vehiculo.getFaros());
		this.setMotor(vehiculo.getMotor());
		this.setPlaca(vehiculo.getPlaca());
		this.setCantidadPuertas(vehiculo.getCantidadPuertas());
	}
	public int getCantidadRuedas() {
		return cantidadRuedas;
	}

	public void setCantidadRuedas(int cantidadRuedas) {
		this.cantidadRuedas = cantidadRuedas;
	}

	public Capo getCapo() {
		return capo;
	}

	public void setCapo(Capo capo) {
		this.capo = capo;
	}

	public Baul getBaul() {
		return baul;
	}

	public void setBaul(Baul baul) {
		this.baul = baul;
	}

	public Carroceria getCarroceria() {
		return carroceria;
	}

	public void setCarroceria(Carroceria carroceria) {
		this.carroceria = carroceria;
	}

	public Faro getFaros() {
		return faros;
	}

	public void setFaros(Faro faro) {
		this.faros = faro;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Placa getPlaca() {
		return placa;
	}

	public void setPlaca(Placa placa) {
		this.placa = placa;
	}

	public int getCantidadPuertas() {
		return cantidadPuertas;
	}

	public void setCantidadPuertas(int cantidadPuertas) {
		this.cantidadPuertas = cantidadPuertas;
	}
	public void setRueda(Rueda rueda) {
		this.rueda=rueda; 
	}
	public Rueda getRueda() {
		return rueda;
	}

}
