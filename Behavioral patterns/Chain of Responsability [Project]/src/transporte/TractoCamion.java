package transporte;

public class TractoCamion extends Transportador{
	
	@Override
	public String transportar(Carga carga) {
		if(carga.getTipo().equals("Objetos"))
			return "El Tractocamión transporta a los objetos";
		if(siguiente!=null)
			return siguiente.transportar(carga); //Delega la responsabilidad al siguiente si existe
		return null;
	}
}
