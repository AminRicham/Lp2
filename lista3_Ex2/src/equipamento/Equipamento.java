package equipamento;

public class Equipamento {
	public boolean ligado;
	public String nome;
	
	public Equipamento() {
		
	}
	public Equipamento(String nome) {
		this.nome=nome;
	}
	public void liga() {
		ligado= true;
	}
	public void desliga() {
		ligado=false;
	}
	public String toString() {
		return("\nLigado:"+ligado+"\nNome:"+nome);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
