package fabricaVehiculos;

public class Motor {
	private String potencia;
	private String marca;
	Motor(String potencia, String marca)
	{
		this.setPotencia(potencia);
		this.setMarca(marca);
	}
	public String getPotencia() {
		return potencia;
	}
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
