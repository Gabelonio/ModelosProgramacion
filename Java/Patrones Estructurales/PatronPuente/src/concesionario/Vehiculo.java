package concesionario;

public abstract class Vehiculo {
	
	private Motor motor;

	public Motor getMotor() {
		return motor;
	}

	public void montarMotor(Motor motor) {
		this.motor = motor;
	}
	
}
