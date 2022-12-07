package contatos;

public class Contato {
	private String nome;
	private int telefone1;
	private int telefone2;
	private String endereço;
	private String relaçao;
	
	public boolean comparaçao(String nome) {
		if(this.nome.equalsIgnoreCase(nome)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Contato() {
		
	}
	public Contato(String nome, int telefone1, int telefone2, String endereço, String relaçao){
		this.nome=nome;
		this.telefone1=telefone1;
		this.telefone2=telefone2;
		this.endereço=endereço;
		this.relaçao=relaçao;
	}
	public Contato(String nome, int telefone, String endereço, String relaçao) {
		this.nome=nome;
		this.telefone1=telefone;
		this.endereço=endereço;
		this.relaçao=relaçao;		
	}
	
	public String toString() {
		return("Nome:"+nome+
				"\nTelefone1:"+telefone1+"\nTelefone2:"+telefone2+
				"\nEndereçp"+endereço+
				"\nRelaçao:"+relaçao);
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setTelefone1(int telefone1) {
		this.telefone1=telefone1;
	}
	public int getTelefone1() {
		return telefone1;
	}
	
	public void setTelefone2(int telefone2) {
		this.telefone2=telefone2;
	}
	public int getTelefone2() {
		return telefone2;
	}
	
	public void setEndereço(String endereço) {
		this.endereço=endereço;
	}
	public String getEndereço() {
		return endereço;
	}
	
	public String getRelaçao() {
		return relaçao;
	}
	public void setRelaçao(String relaçao) {
		this.relaçao = relaçao;
	}
	
}
