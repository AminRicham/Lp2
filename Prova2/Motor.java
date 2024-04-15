package prova;

public class Motor {
	private int numCilindro;
	private int potencia;
	
	public Motor(int numCilindro, int potencia) {
		this.numCilindro=numCilindro;
		this.potencia=potencia;
	}
	public Motor() {
		
	}

	public void setNumCilindro(int numCilindro) {
		this.numCilindro=numCilindro;
	}
	public int getNumCilindro() {
		return numCilindro;
	}
	public void setPotencia(int potencia) {
		this.potencia=potencia;
	}
	public int getPotencia() {
		return potencia;
	}
	public String toString() {
		return ("\nNumCilindro:"+numCilindro+"\nPotencia:"+potencia);
	}
	
}
