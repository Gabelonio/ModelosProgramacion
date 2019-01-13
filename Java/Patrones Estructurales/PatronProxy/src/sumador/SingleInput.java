package sumador;

import java.util.Scanner;

public class SingleInput {
	private static SingleInput insercion; 
	private SingleInput() {}
	
	public static SingleInput getInsercion() {
		return (insercion==null)?insercion=new SingleInput():null;
	}
	
	@SuppressWarnings("resource")
	public float insertar() {
		return new Scanner(System.in).nextFloat();
	}
}
