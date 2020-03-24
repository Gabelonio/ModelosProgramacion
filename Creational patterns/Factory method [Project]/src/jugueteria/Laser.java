package jugueteria;

public class Laser implements Juguete{
	
	private String color; 
	
	@Override
	public String encender() {
		return "esta apuntando";
	}

	Laser(String color){
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}
}
