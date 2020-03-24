package reloj;

public class PruebaDecorator {
	public static void main(String args[]) {
		Relojeria swatch=new Reloj();
		swatch=new FormatoDoce(swatch);
		swatch=new Fecha(swatch);
		
		System.out.println(swatch.getHora());
		
	}
}
