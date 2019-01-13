package papelera;

import java.util.ArrayList;

public class Folder extends UtilEscolar{

	private ArrayList<Hoja> hojas;
	private ArrayList<Separador> separadores; 
	
	Folder(){
		hojas=new ArrayList<Hoja>();
		separadores=new ArrayList<Separador>();
	}
	
	@Override
	public void moverCoordenadaY(int movimiento) {
		if(this.coordenadaY+movimiento>=0){
			
			for(int i=0;i<hojas.size();i++)
				this.hojas.get(i).coordenadaY+=movimiento;
			for(int i=0;i<separadores.size();i++)
				this.separadores.get(i).coordenadaY+=movimiento;
			this.coordenadaY+=movimiento; 
			
		}
	}

	@Override
	public void moverCoordenadaX(int movimiento) {
		if(this.coordenadaX+movimiento>=0){
			
			for(int i=0;i<hojas.size();i++)
				this.hojas.get(i).coordenadaX+=movimiento;
			for(int i=0;i<separadores.size();i++)
				this.separadores.get(i).coordenadaX+=movimiento;
			this.coordenadaX+=movimiento; 
			
		}
	}

	@Override
	public void rotar(int rotacion) {
		if(this.rotacion+rotacion>=0) {
			
			for(int i=0;i<hojas.size();i++) {
				this.hojas.get(i).rotacion+=(this.rotacion+rotacion>=360)?rotacion-360:rotacion;
			}
			for(int i=0;i<separadores.size();i++) {
				this.separadores.get(i).rotacion+=(this.rotacion+rotacion>=360)?rotacion-360:rotacion;
			}
			this.rotacion+=(this.rotacion+rotacion>=360)?rotacion-360:rotacion;
		}
	}
	
	@Override
	public void agregar(UtilEscolar componente) {
		if(componente.getClass().getSimpleName().equals("Hoja"))
			this.hojas.add((Hoja)componente);
		if(componente.getClass().getSimpleName().equals("Separador"))
			this.separadores.add((Separador)componente);
	}

	@Override
	public void retirar(UtilEscolar componente, int localizacion) {
		if(componente.getClass().getSimpleName().equals("Hoja"))
			retirarHoja(localizacion); 
		if(componente.getClass().getSimpleName().equals("Separador"))
			retirarSeparador(localizacion); 
	}

	private void retirarHoja(int localizacion) {
		if(this.hojas.size()>=localizacion) 
			this.hojas.remove(localizacion-1);	
	}
	
	private void retirarSeparador(int localizacion){
		if(this.separadores.size()>=localizacion)
			this.separadores.remove(localizacion-1);
	}
	
}

