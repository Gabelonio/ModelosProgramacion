package fabricaVehiculos;

public class Faro {
	private double intensidad;
	private int anioVencimiento;
	Faro(double intensidad,int anioVencimiento)
	{
		this.setIntensidad(intensidad);
		this.setAnioVencimiento(anioVencimiento);
	}
	public double getIntensidad() {
		return intensidad;
	}
	public void setIntensidad(double intensidad) {
		this.intensidad = intensidad;
	}
	public int getAnioVencimiento() {
		return anioVencimiento;
	}
	public void setAnioVencimiento(int anioVencimiento) {
		this.anioVencimiento = anioVencimiento;
	}
	
}
