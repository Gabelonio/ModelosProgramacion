package puntosinformacion;

import java.util.ArrayList;

public class GeneradorPtoInformacion {
	
	private static GeneradorPtoInformacion generadorPuntos;
	private ArrayList<InterfazPuntoInformacion> puntosInformacion;
	
	private GeneradorPtoInformacion(){}
	
	public static GeneradorPtoInformacion getGeneradorPtoInformacion() {
		if(generadorPuntos==null) {
			generadorPuntos=new GeneradorPtoInformacion();
			generadorPuntos.puntosInformacion=new ArrayList<InterfazPuntoInformacion>();
		}
		return generadorPuntos; 
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
