package fabricaSillas;

public class Cliente {
	EstructuraAbstracta estructura;
	RespaldoAbstracto respaldo; 
	SuperficieAbstracta superficie; 
	public void comprarEstructura(EstructuraAbstracta estructura){
		this.estructura=estructura;
	}
	public void comprarRespaldo(RespaldoAbstracto respaldo) {
		this.respaldo=respaldo;
	}
	public void comprarSuperficie(SuperficieAbstracta superficie) {
		this.superficie=superficie;
	}
	public void mostrarCompra(){
		
	}
	
}
