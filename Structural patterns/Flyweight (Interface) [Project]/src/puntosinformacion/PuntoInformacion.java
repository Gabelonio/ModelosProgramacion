package puntosinformacion;

public class PuntoInformacion implements InterfazPuntoInformacion{
	
	private String identificador;
	
	PuntoInformacion(String identificador){
		this.identificador=identificador; 
	}
	
	@Override
	public String getIdentificador(){
		return this.identificador; 
	}
	
	@Override
	public String informar(String nombreTienda) {
		return ("El punto "+this.identificador+" ha informado la ubicacion de : "+nombreTienda);
	}
	
}
