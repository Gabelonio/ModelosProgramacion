package jugueteria;

public class Robot implements Juguete{
	
	private String color; 
	
	@Override
	public String encender() {
		return "esta bailando";
	}
	
	Robot(String color){
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}
}
