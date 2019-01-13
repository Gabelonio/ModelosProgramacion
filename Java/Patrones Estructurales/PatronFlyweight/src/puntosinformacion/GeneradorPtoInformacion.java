package puntosinformacion;

import java.util.ArrayList;

public class GeneradorPtoInformacion {
	private ArrayList<PuntoInformacion> puntosInformacion;
	
	GeneradorPtoInformacion(){
		puntosInformacion=new ArrayList<PuntoInformacion>();
	}
	
	public PuntoInformacion llamarPuntoInformacion(String identificador) {
		
		for(int i=0;i<puntosInformacion.size();i++) {
			if(puntosInformacion.get(i).getIdentificador().equals(identificador)) {
				SingleOutput out=SingleOutput.getImpresion();
				out.imprimir(puntosInformacion.get(i).getIdentificador()+" existente");
				return puntosInformacion.get(i);
			}
		}
		
		PuntoInformacion nuevoPunto=new PuntoInformacion(identificador);
		puntosInformacion.add(nuevoPunto);
		return nuevoPunto; 
	}
}
