package reloj;
public class Formato24 extends RelojDecorator{
	
	Formato24(Relojeria relojeria) {
		super(relojeria);
	}

	@Override
	public String getHora() {
		if(getRelojeria().getHora().contains("AM"))
			return getRelojeria().getHora().replace("AM","");
		if(getRelojeria().getHora().contains("PM"))
			return String.valueOf(Integer.parseInt(getRelojeria().getHora().replace("PM","").substring(0,2))+12);	
		else 
			return getRelojeria().getHora();
	}
}
