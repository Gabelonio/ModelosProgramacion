package plantilla;

public class Cubo extends Solido{
	
	private float lado;
	
	Cubo(float lado){
		this.lado=lado;
	}

	@Override
	protected float obtenerVolumen() {
		return (float)(Math.pow(this.lado,3));
	}

	@Override
	protected float obtenerArea() {
		return (float)(Math.pow(this.lado,2)*6);
	}

}
