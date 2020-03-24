package transporte;

public class CamionDeAlimentos extends Transportador{

	@Override
	public String transportar(Carga carga) {
		if(carga.getTipo().equals("Alimentos"))
			return "El Camión transporta a los alimentos";
		if(siguiente!=null)
			return siguiente.transportar(carga); //Delega la responsabilidad al siguiente si existe
		return null;
	}
}
