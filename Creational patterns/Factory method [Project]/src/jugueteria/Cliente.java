package jugueteria;

public class Cliente {
	private Juguete juguete;

	public Juguete verJuguete() {
		return juguete;
	}

	public void comprarJuguete(Juguete juguete) {
		this.juguete = juguete;
	} 
	
}
