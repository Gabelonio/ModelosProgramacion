package fabricaMasiva;

public class CapoPrototipo extends Capo implements Duplicable{

	@Override
	public CapoPrototipo duplicar() {
		Capo c=new CapoPrototipo();
		c.setColor(this.getColor());
		c.setAncho(this.getAncho());
		c.setLargo(this.getLargo());
		return (CapoPrototipo) c;
	}

}
