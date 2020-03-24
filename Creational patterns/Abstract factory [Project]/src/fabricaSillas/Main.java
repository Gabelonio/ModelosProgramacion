package fabricaSillas;
import java.util.Scanner;
public class Main {	
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		FabricaConcretaMAluminio fabAluminio=new FabricaConcretaMAluminio();
    	FabricaConcretaMMadera fabMadera=new FabricaConcretaMMadera();
    	FabricaConcretaMPlastico fabPlastico=new FabricaConcretaMPlastico();
    	Cliente cliente=new Cliente();
    	int opcion; 
    	do {
    		System.out.println("Bienvenido a la Fabrica de Sillas\nSeleccione compra\n1.Estructura de Aluminio\n2.Estructura de Madera\n3.Estructura de Plastico");
    		opcion=cin.nextInt();
	    	switch(opcion)
	    	{
	    		case 1:{
	    			cliente.comprarEstructura(fabAluminio.construirEstructura());
	    			break;
	    		}
	    		case 2:{
	    			cliente.comprarEstructura(fabMadera.construirEstructura());
	    			break;
	    		}
	    		case 3:{
	    			cliente.comprarEstructura(fabPlastico.construirEstructura());
	    			break;
	    		}
	    		default:{
	    			System.out.println("opcion invalida");
	    			break;
	    		}
	    	}
    	}while(opcion<=0||opcion>3);   	
    	do {
    		System.out.println("\nSeleccione compra\n1.Respaldo de Aluminio\n2.Respaldo de Madera\n3.Respaldo de Plastico");
        	opcion=cin.nextInt();
	    	switch(opcion)
	    	{
	    		case 1:{
	    			cliente.comprarRespaldo(fabAluminio.construirRespaldo());
	    			break;
	    		}
	    		case 2:{
	    			cliente.comprarRespaldo(fabMadera.construirRespaldo());
	    			break;
	    		}
	    		case 3:{
	    			cliente.comprarRespaldo(fabPlastico.construirRespaldo());
	    			break;
	    		}
	    		default:{
	    			System.out.println("opcion invalida");
	    			break;
	    		}
	    	}
    	}while(opcion<=0||opcion>3);
    	do {
    		System.out.println("\nSeleccione compra\n1.Superficie de Aluminio\n2.Superficie de Madera\n3.Superficie de Plastico");
        	opcion=cin.nextInt();
	    	switch(opcion)
	    	{
	    		case 1:{
	    			cliente.comprarSuperficie(fabAluminio.construirSuperficie());
	    			break;
	    		}
	    		case 2:{
	    			cliente.comprarSuperficie(fabMadera.construirSuperficie());
	    			break;
	    		}
	    		case 3:{
	    			cliente.comprarSuperficie(fabPlastico.construirSuperficie());
	    			break;
	    		}
	    		default:{
	    			System.out.println("opcion invalida");
	    			break;
	    		}
	    	}
    	}while(opcion<=0||opcion>3);
    	System.out.println("Compra Exitosa!");
    	cliente.mostrarCompra();
    }
}
