package fabricaMasiva;

public class BaulPrototipo extends Baul implements Duplicable{

	@Override
	public BaulPrototipo duplicar() {
		Baul b=new BaulPrototipo();
		b.setClase(this.getClase());
		b.setAncho(this.getAncho());
		b.setLargo(this.getLargo());
		return (BaulPrototipo) b;
	}	
}