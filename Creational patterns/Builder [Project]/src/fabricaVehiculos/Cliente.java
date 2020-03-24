package fabricaVehiculos;

public class Cliente 
{	
	 private Vehiculo vehiculo;
	 public void comprarAuto(Consecionario con)
	 {
		 this.vehiculo=con.getEnsamblador().getVehiculo();
	 }
	 public Vehiculo getCompra()
	 {
		 return this.vehiculo;
	 }
}				

