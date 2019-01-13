package concesionario;

public class PruebaPuente {
	public static void main(String[] args) {
		
		Motor motor;
		Vehiculo auto;
		SingleOutput consoleOut=SingleOutput.getImpresion();
		
		auto=new Carro();
		motor=new MotorElectrico();
		auto.montarMotor(motor);
		
		consoleOut.imprimir(auto.getMotor().encenderMotor());
	}
}
