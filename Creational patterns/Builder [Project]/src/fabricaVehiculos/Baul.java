package fabricaVehiculos;

public class Baul {
	private String clase;
	private double ancho;
	private double largo;
	Baul(String clase,double ancho,double largo)
	{
		this.setClase(clase);
		this.setAncho(ancho);
		this.setLargo(largo);
	}
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public double getLargo() {
		return largo;
	}
	public void setLargo(double largo) {
		this.largo = largo;
	} 
	
}
