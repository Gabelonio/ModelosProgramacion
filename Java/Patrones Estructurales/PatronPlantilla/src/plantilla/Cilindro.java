package plantilla;

public class Cilindro extends Solido{

	private float radio;
	private float altura; 
	
	Cilindro(float radio,float altura){
		this.radio=radio;
		this.altura=altura;
	}
	
	@Override
	protected float obtenerVolumen() {
		return (float)((Math.PI)*(Math.pow(this.radio,2))*this.altura);
	}

	@Override
	protected float obtenerArea() {
		return (float)(2*(Math.PI)*this.radio*(this.radio+this.altura));
	}

	
}
