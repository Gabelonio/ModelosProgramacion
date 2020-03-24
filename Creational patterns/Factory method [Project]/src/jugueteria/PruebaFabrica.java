package jugueteria;

public class PruebaFabrica {
	
	public static void main(String[] args)
	{
		
		Cliente cliente = new Cliente(); 
		
		JugueteFactoryMethod Mattel=new JugueteFactory();
		
		cliente.comprarJuguete(Mattel.crearJuguete("Robot","Azul"));
		System.out.println("Su "+cliente.verJuguete().getClass().getSimpleName()+
							" "+cliente.verJuguete().getColor()+" "+cliente.verJuguete().encender());
	}
}
