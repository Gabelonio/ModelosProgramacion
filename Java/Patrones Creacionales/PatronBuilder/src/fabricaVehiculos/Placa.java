package fabricaVehiculos;

public class Placa {
	private String ciudadCreacion; 
	private String paisCreacion;
	
	Placa(String ciudadCreacion,String paiscreacion)
	{
		this.setciudadCreacion(ciudadCreacion);
		this.setpaisCreacion(paiscreacion);
	}
	public String getciudadCreacion() {
		return ciudadCreacion;
	}
	public void setciudadCreacion(String ciudadCreacion) {
		this.ciudadCreacion = ciudadCreacion;
	}
	public String getpaisCreacion() {
		return paisCreacion;
	}
	public void setpaisCreacion(String paisCreacion) {
		this.paisCreacion = paisCreacion;
	}
	
}
