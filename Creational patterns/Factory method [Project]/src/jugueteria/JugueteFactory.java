package jugueteria;

public class JugueteFactory implements JugueteFactoryMethod{

	@Override
	public Juguete crearJuguete(String tipo, String color) {
		switch(tipo)
		{
			case "Laser":{
				return new Laser(color);
			}
			case "Pistola":{
				return new Pistola(color);
			}
			case "Robot":{
				return new Robot(color);
			}
			default:{
				return null;
			}
		}
	}
}
