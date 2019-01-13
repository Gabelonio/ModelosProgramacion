package fabricaMasiva;

public class PlacaPrototipo extends Placa implements Duplicable {

	@Override
	public PlacaPrototipo duplicar() {
		Placa p=new PlacaPrototipo();
		p.setciudadCreacion(this.getciudadCreacion());
		p.setpaisCreacion(this.getpaisCreacion());
		return (PlacaPrototipo) p;
	}

}
