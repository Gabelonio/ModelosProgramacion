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
	public void informar(String nombreTienda) {
		SingleOutput out=SingleOutput.getImpresion();
		out.imprimir("El punto "+this.identificador+" ha informado la ubicacion de : "+nombreTienda);
	}
	
}
