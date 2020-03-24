package plantilla;

public class Esfera extends Solido {
	private float radio;

	Esfera(float radio){
		this.radio=radio;
	}
	@Override
	protected float obtenerVolumen() {
		return (float)((4/3)*(Math.PI)*(Math.pow(this.radio,2)));
	}

	@Override
	protected float obtenerArea() {
		return (float)(4*(Math.PI)*(Math.pow(this.radio,2)));
	}

}
