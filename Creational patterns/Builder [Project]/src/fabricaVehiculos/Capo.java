package fabricaVehiculos;
public class Capo {
	private String color; 
	private double ancho; 
	private double largo;
	Capo(String color,double ancho,double largo)
	{
		this.setColor(color);
		this.setAncho(ancho);
		this.setLargo(largo);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
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
