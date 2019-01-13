package fabricaMasiva;

public class Cliente 
{	
	 private Vehiculo vehiculo;
	 public void comprarAuto(Consecionario con)
	 {
		 this.vehiculo=con.getVehiculo();
	 }
	 public Vehiculo getCompra()
	 {
		 return this.vehiculo;
	 }
}				

