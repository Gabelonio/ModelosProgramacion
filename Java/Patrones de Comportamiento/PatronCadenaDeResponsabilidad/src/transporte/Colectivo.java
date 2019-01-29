package transporte;

public class Colectivo extends Transportador{

	@Override
	public String transportar(Carga carga) {
		if(carga.getTipo().equals("Personas"))
			return "El Colectivo transporta a los pasajeros";
		if(siguiente!=null)
			return siguiente.transportar(carga); //Delega la responsabilidad al siguiente si existe
		return null;
	}
	
}
