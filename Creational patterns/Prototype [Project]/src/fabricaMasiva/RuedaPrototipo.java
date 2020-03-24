package fabricaMasiva;

public class RuedaPrototipo extends Rueda implements Duplicable{

	@Override
	public RuedaPrototipo duplicar() {
		Rueda r=new RuedaPrototipo();
		r.setMarca(this.getMarca());
		r.setColor(this.getColor());
		return (RuedaPrototipo) r;
	}

}
