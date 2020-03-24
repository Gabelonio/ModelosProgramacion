package fabricaMasiva;

public class VehiculoPrototipo extends Vehiculo implements Duplicable{
	@Override
	public VehiculoPrototipo duplicar() {
		Vehiculo p=new VehiculoPrototipo();
		p.setRueda(this.getRueda());
		p.setCantidadPuertas(this.getCantidadPuertas());
		p.setCapo(this.getCapo());
		p.setBaul(this.getBaul());
		p.setCarroceria(this.getCarroceria());
		p.setFaros(this.getFaros());
		p.setMotor(this.getMotor());
		p.setPlaca(this.getPlaca());
		p.setCantidadRuedas(this.getCantidadRuedas());
		return (VehiculoPrototipo) p;
	}
}
