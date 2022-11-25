package paciente;

public class Paciente {
	private int codigo;
	private int cpf;
	private int telefone;
	private String nome;
	
	public static void busca(int codigo, Paciente[] vetor) {
		int x=0;
		for(int i=0; i<vetor.length; i++){
			if(vetor[i].codigo == codigo){
				x++;
			}
		}
		if(x>0){
			System.out.println("Encontrado");
			System.out.println(toString());
		}
		else{
			System.out.println("Nao encontrado");
		}
			
	}
	
	public String toString(){
		return("Codigo:"+codigo+" cpf: "+cpf+"\ntelefone:"+telefone+" \nnome: "+nome);
		
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
