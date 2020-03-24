package papelera;

public abstract class UtilEscolar {
	
	protected int coordenadaX; 
	protected int coordenadaY;
	protected int rotacion; 
	
	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}
	
	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}
	
	public void setRotacion(int rotacion) {
		this.rotacion= rotacion;
	}
	
	public void moverCoordenadaY(int movimiento) {
		this.coordenadaY+=(this.coordenadaY+movimiento<=0)?0:movimiento;    //Movimiento debe ser positivo
	}
	
	public void moverCoordenadaX(int movimiento) {
		this.coordenadaX+=(this.coordenadaX+movimiento<=0)?0:movimiento;
	}
	
	public void rotar(int rotacion) {
			if(this.rotacion+rotacion>=0)                                   //Rotacion debe ser positiva
			this.rotacion+=rotacion%360; 									//Modulo de 360 grados
	}
	
	public void agregar(UtilEscolar componente){};
	
	public void retirar(UtilEscolar componente,int localizacion){}; 
	
}
