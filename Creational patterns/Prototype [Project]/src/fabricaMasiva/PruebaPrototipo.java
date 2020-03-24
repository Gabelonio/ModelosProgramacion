package fabricaMasiva;

public class PruebaPrototipo {
	public static void main(String[] args)
	{
		Cliente cliente=new Cliente();
		Consecionario con = new Consecionario();
		BaulPrototipo baulmodelo=new BaulPrototipo();
		baulmodelo.setAncho(1.5);
		baulmodelo.setLargo(1);
		baulmodelo.setClase("Familiar");
		CapoPrototipo capomodelo=new CapoPrototipo();
		capomodelo.setAncho(1.25);
		capomodelo.setLargo(2);
		capomodelo.setColor("Por Definir");
		CarroceriaPrototipo carroceriamodelo=new CarroceriaPrototipo();
		carroceriamodelo.setColor("Por Definir");
		carroceriamodelo.setMaterial("Aluminio");
		FaroPrototipo faromodelo=new FaroPrototipo();
		faromodelo.setAnioVencimiento(2050);
		faromodelo.setIntensidad(3.5);
		MotorPrototipo motormodelo=new MotorPrototipo(); 
		motormodelo.setMarca("Por Definir");
		motormodelo.setPotencia("Por Definir");
		PlacaPrototipo placamodelo=new PlacaPrototipo(); 
		placamodelo.setciudadCreacion("Por Definir");
		placamodelo.setpaisCreacion("Alemania");
		RuedaPrototipo ruedamodelo=new RuedaPrototipo();
		ruedamodelo.setColor("Por Definir");
		ruedamodelo.setMarca("Michelin");
		VehiculoPrototipo vehiculomodelo=new VehiculoPrototipo();
		vehiculomodelo.setBaul(baulmodelo.duplicar());
		vehiculomodelo.setCantidadPuertas(4);
		vehiculomodelo.setCantidadRuedas(4);
		vehiculomodelo.setCapo(capomodelo.duplicar());
		vehiculomodelo.setCarroceria(carroceriamodelo.duplicar());
		vehiculomodelo.setFaros(faromodelo.duplicar());
		vehiculomodelo.setMotor(motormodelo.duplicar());
		vehiculomodelo.setPlaca(placamodelo.duplicar());
		vehiculomodelo.setRueda(ruedamodelo.duplicar());			
		
		Vehiculo compra=new Vehiculo(vehiculomodelo.duplicar());
		compra.getCapo().setColor("Negro");
		compra.getCarroceria().setColor("Verde");
		compra.getMotor().setMarca("Mazda");
		compra.getMotor().setPotencia("250 HP");
		compra.getPlaca().setciudadCreacion("Berlin");
		compra.getRueda().setColor("Blanco");
		
		con.construirVehiculo(compra);
		cliente.comprarAuto(con);
		
		System.out.println("\nVehiculo comprado\nInformacion de las Ruedas: Marca "+cliente.getCompra().getRueda().getMarca()+
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
 