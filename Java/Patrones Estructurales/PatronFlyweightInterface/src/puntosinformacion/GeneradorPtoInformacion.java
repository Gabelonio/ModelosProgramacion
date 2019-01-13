package puntosinformacion;

import java.util.ArrayList;

public class GeneradorPtoInformacion {
	private ArrayList<InterfazPuntoInformacion> puntosInformacion;
	
	GeneradorPtoInformacion(){
		puntosInformacion=new ArrayList<InterfazPuntoInformacion>();
	}
	
	public InterfazPuntoInformacion llamarPuntoInformacion(String identificador) {
		
		for(int i=0;i<puntosInformacion.size();i++) {
			if(puntosInformacion.get(i).getIdentificador().equals(identificador)) {
				SingleOutput out=SingleOutput.getImpresion();
				out.imprimir(puntosInformacion.get(i).getIdentificador()+" existente");
				return puntosInformacion.get(i);
			}
		}
		
		InterfazPuntoInformacion nuevoPunto=new PuntoInformacion(identificador);
		puntosInformacion.add(nuevoPunto);
		return nuevoPunto; 
	}
}
