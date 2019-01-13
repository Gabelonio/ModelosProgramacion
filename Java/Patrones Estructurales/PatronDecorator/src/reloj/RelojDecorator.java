package reloj;

public abstract class RelojDecorator extends Relojeria{
	
	private Relojeria relojeria;

	RelojDecorator(Relojeria relojeria){
		this.setRelojeria(relojeria);
	}
	
	public Relojeria getRelojeria() {
		return relojeria;
	}

	public void setRelojeria(Relojeria relojeria) {
		this.relojeria = relojeria;
	}

}
