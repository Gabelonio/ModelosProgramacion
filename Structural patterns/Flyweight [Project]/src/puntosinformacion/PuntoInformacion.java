package puntosinformacion;

public class PuntoInformacion{
	
	private String identificador;
	
	PuntoInformacion(String identificador){
		this.identificador=identificador; 
	}
	
	public String getIdentificador(){
		return this.identificador; 
	}
	
	public void informar(String nombreTienda) {
		SingleOutput out=SingleOutput.getImpresion();
		out.imprimir("El punto "+this.identificador+" ha informado la ubicacion de : "+nombreTienda);
	}
	
}
