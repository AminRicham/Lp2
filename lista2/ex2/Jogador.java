package ex2;

public class Jogador {
	private String nome;
	private String posi;
	private String nacio;
	private float altura;
	private float peso;
	
	
	public static void imc(Jogador jogador) {
		double imc;
		imc= jogador.getPeso()/Math.pow(jogador.getAltura(), 2);
		System.out.println("\no Imce é:"+imc);
	}
	
	public Jogador() {
		
	}
	public Jogador(String nome, String posi, String nacio, float altura, float peso) {
		this.nome = nome;
		this.posi=posi;
		this.nacio =nacio;
		this.altura=altura;
		this.peso=peso;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	public String getNome() {
		return nome;
	}
	public void setPosi(String posi) {
		this.posi=posi;
	}
	public String getPosi() {
		return posi;
	}
	public void setNacio(String nacio) {
		this.nacio=nacio;
	}
	public String getNacio() {
		return nacio;
	}
	public void setAltura(float altura) {
		this.altura=altura;
	}
	public float getAltura() {
		return altura;
	}
	public void setPeso(float peso) {
		this.peso=peso;
	}
	public float getPeso() {
		return peso;
	}
	public String toString() {
		return("Nome:"+nome+"\nPosi:"+posi+"\nNacio:"+nacio+ "\nAltura:"+altura+"\nPeso:"+peso);
	}
	
}
