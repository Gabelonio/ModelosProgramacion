package papelera;

public class PruebaComposite {
	public static void main(String args[]) {
		Cliente cliente=new Cliente();
		UtilEscolar folder=new Folder();
		UtilEscolar hojaUno=new Hoja();
		UtilEscolar hojaDos=new Hoja();
		UtilEscolar separador=new Separador();
		SingleOutput consoleOut=SingleOutput.getImpresion();
		
		cliente.setUtil(folder);
		
		cliente.getUtil().agregar(hojaUno);
		cliente.getUtil().agregar(hojaDos);
		cliente.getUtil().agregar(separador);

		cliente.getUtil().moverCoordenadaX(13);
		
		consoleOut.imprimir("El Folder se encuentra en "+cliente.getUtil().coordenadaX+","+cliente.getUtil().coordenadaY);
		consoleOut.imprimir("La Hoja se encuentra en "+hojaDos.coordenadaX+","+hojaDos.coordenadaY);
		
		cliente.getUtil().retirar(new Hoja(),2);
		hojaDos.moverCoordenadaX(-5);
		cliente.getUtil().moverCoordenadaX(3);
		
		consoleOut.imprimir("El Folder se encuentra en "+cliente.getUtil().coordenadaX+","+cliente.getUtil().coordenadaY);
		consoleOut.imprimir("La Hoja se encuentra en "+hojaDos.coordenadaX+","+hojaDos.coordenadaY);
		
	}
}
