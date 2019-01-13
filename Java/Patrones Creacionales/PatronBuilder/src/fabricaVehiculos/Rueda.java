package fabricaVehiculos;

public class Rueda {
	
	private String marca;
	private String color;
	
	Rueda(String marca,String color)
	{
		this.setMarca(marca);
		this.setColor(color);
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	} 
	
}
