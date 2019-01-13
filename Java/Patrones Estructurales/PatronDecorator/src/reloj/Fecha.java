package reloj;

import java.util.Calendar;

public class Fecha extends RelojDecorator{

	Fecha(Relojeria relojeria) {
		super(relojeria);
	}

	@Override
	public String getHora() {
		Calendar calendario=Calendar.getInstance();
		return getRelojeria().getHora()+" "+calendario.DAY_OF_MONTH+
				"/"+(calendario.MONTH+1)+"/"+Calendar.YEAR;
	}
	
}
