package plantilla;

public abstract class Solido {
	
	public final void mostrarInformacion() {
		SingleOutput out=SingleOutput.getImpresion();
		out.imprimir("Informaci�n del "+this.getClass().getSimpleName());
		out.imprimir("Volumen: "+this.obtenerVolumen()+" metros cubicos");
		out.imprimir("Area: "+this.obtenerArea()+" metros cuadrados");
	}
	
	protected abstract float obtenerVolumen();
	protected abstract float obtenerArea();
}
