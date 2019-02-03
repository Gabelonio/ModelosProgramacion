package transporte;

public class GestorTransporte {
	
	private GestorTransporte siguiente;
	private int cobro;
	private double condicion;
	
	
	GestorTransporte(int cobro,double condicion){
		this.cobro=cobro;
		this.condicion=condicion;
		this.siguiente=null;
	}
	
	GestorTransporte(int cobro,double condicion,GestorTransporte sucesor){
		this(cobro,condicion);
		this.siguiente=sucesor;
	}
	
	public String manejarPeticion(double pesoKg){
		if(pesoKg<=condicion) {
			return "Debe pagar $"+this.cobro;								
		}
		return (siguiente!=null)?this.siguiente.manejarPeticion(pesoKg)
								:"Peso no soportado";
	}
}

	

