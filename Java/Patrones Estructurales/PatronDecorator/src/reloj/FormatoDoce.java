package reloj;

public class FormatoDoce extends RelojDecorator {
	
	FormatoDoce(Relojeria relojeria) {
		super(relojeria);
	}

	@Override
	public String getHora() {
		if(Integer.parseInt(getRelojeria().getHora().substring(0,2))>12){
			return String.valueOf(Integer.parseInt(getRelojeria().getHora().substring(0,2))-12)+" PM";
		}
		else{
			return getRelojeria().getHora()+" AM";
		}
	} 
	
}
