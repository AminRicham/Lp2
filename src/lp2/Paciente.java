package lp2;

public class Paciente {
	private int codigo;
	private int cpf;
	private int telefone;
	private String nome;
	
	public void verifica(int codigo) {
		
	}
	
	
	
	public Paciente(int codigo, int cpf, int telefone, String nome) {
		this.codigo = codigo;
		this.cpf = cpf;
		this.telefone = telefone;
		this.nome = nome;
	}
	public Paciente() {
		
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf=cpf;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone=telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
