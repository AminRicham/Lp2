package pais;

public class Pais {
	private String nome;
	private int pop;
	private float dimen;
	
	
	
	public float densidade(int pop, float dimen) {
		return (pop/dimen);
	}
	
	
	public Pais(String nome, int pop, float dimen) {
		this.nome = nome;
		this.pop = pop;
		this.dimen = dimen;
	}
	public Pais() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome= nome;
	}
	public int getPop() {
		return pop;
	}
	public void setPop(int pop) {
		this.pop=pop;
	}
	public float getDimen() {
		return dimen;
	}
	public void setDimen(float dimen) {
		this.dimen =dimen;
	}
	public String toString() {
		return ("Nome:"+nome+"\nPopulaçao:"+pop+"\nDimensao:"+dimen+"\nDensidade"+densidade(pop, dimen));
	}
}

