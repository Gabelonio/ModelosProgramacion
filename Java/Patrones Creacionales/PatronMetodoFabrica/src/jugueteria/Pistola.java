package jugueteria;

public class Pistola implements Juguete{
	private String color;
	
	@Override
	public String encender() {
		return "esta disparando";
		
	}
	
	Pistola(String color){
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}

}
