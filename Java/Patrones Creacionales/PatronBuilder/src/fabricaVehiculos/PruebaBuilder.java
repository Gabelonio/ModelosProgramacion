package fabricaVehiculos;

public class PruebaBuilder {
	public static void main(String[] args)
	{
		Cliente cliente=new Cliente();
		Consecionario con = new Consecionario();
		con.setEnsamblador(new CarroBuilder());
		con.construirVehiculo();
		cliente.comprarAuto(con);
		String producto=con.getEnsamblador().getClass().getSimpleName();
		System.out.println("Usted ha comprado un "+producto.substring(0,producto.indexOf("Builder")));
		System.out.println("Informacion de las Ruedas: Marca "+cliente.getCompra().getRueda().getMarca()+
			 			   " color "+cliente.getCompra().getRueda().getColor()+"\tCantidad: "+cliente.getCompra().getCantidadRuedas());
		System.out.println("Informacion del Capo: Ancho "+cliente.getCompra().getCapo().getAncho()+
			 			   "m\tLargo "+cliente.getCompra().getCapo().getLargo()+"m\tColor: "+cliente.getCompra().getCapo().getColor());
		System.out.println("Informacion del baul: Clase "+cliente.getCompra().getBaul().getClase()+
			 			   "\tAncho "+cliente.getCompra().getBaul().getAncho()+"\tLargo "+cliente.getCompra().getBaul().getLargo());
	    System.out.println("Informacion de la carroceria: Material "+cliente.getCompra().getCarroceria().getMaterial()+
			 			   "\tColor "+cliente.getCompra().getCarroceria().getColor());
		System.out.println("Informacion de los faros: Intensidad "+cliente.getCompra().getFaros().getIntensidad()+
				 		   "W\tVence "+cliente.getCompra().getFaros().getAnioVencimiento());
		System.out.println("Informacion del motor: Marca "+cliente.getCompra().getMotor().getMarca()+
			 			   "\tPotencia: "+cliente.getCompra().getMotor().getPotencia());
		System.out.println("Informacion de la placa: Ciudad de origen "+cliente.getCompra().getPlaca().getciudadCreacion()+
				 		   "\tPais de origen "+cliente.getCompra().getPlaca().getpaisCreacion());
		System.out.println("Cantidad de puertas: "+cliente.getCompra().getCantidadPuertas());
	}
}
 