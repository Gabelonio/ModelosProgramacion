package sumador;

public class SujetoSumaProxy implements Sujeto{

	private SujetoSuma sujeto;
	@Override
	public float sumar(float numeroUno, float numeroDos) {
		if(sujeto==null)
			sujeto=new SujetoSuma(); 
		return sujeto.sumar(numeroUno, numeroDos);
	}

}
