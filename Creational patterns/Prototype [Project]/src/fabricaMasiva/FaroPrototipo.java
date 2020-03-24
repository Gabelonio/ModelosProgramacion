package fabricaMasiva;

public class FaroPrototipo extends Faro implements Duplicable{

	@Override
	public FaroPrototipo duplicar() {
		Faro f=new FaroPrototipo();
		f.setAnioVencimiento(this.getAnioVencimiento());
		f.setIntensidad(this.getIntensidad());
		return (FaroPrototipo) f;
	}

}
