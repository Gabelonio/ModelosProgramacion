package blob;

import javax.swing.JOptionPane;

public class Formulario {
	
	private String nombre,apellido,identificacion;
	
	public void llenarDatos(String nombre,
			String apellido, String identificacion){
		this.nombre=nombre;
		this.apellido=apellido; 
		this.identificacion=identificacion;
	}
	
	public void mostrarDatos() {
		JOptionPane.showMessageDialog(null,
				"Nombre:"+this.nombre+"\nApellido:"+
				this.apellido+"\nIdentifacion"+this.identificacion);
	}
}
