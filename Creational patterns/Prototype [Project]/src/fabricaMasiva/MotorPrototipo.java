package fabricaMasiva;

public class MotorPrototipo extends Motor implements Duplicable{
	@Override
	public MotorPrototipo duplicar() {
		Motor m=new MotorPrototipo();
		m.setMarca(this.getMarca());
		m.setPotencia(this.getPotencia());
		return (MotorPrototipo) m;
	}
}
