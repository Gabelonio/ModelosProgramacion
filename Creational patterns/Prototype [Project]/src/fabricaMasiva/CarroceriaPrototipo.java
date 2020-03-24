package fabricaMasiva;

public class CarroceriaPrototipo extends Carroceria implements Duplicable{
	
	@Override
	public CarroceriaPrototipo duplicar() {
		Carroceria c=new CarroceriaPrototipo();
		c.setColor(this.getColor());
		c.setMaterial(this.getMaterial());
		return (CarroceriaPrototipo) c;
	}
}
