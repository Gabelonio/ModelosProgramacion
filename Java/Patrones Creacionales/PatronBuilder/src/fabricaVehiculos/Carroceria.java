package fabricaVehiculos;

public class Carroceria {
	private String material;
	private String color;
	Carroceria(String material,String color)
	{
		this.setMaterial(material);
		this.setColor(color);
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	} 
	
}
