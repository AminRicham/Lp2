package prova;

public abstract class Veiculo {
	private double peso;
	private double velocMax;
	
	public Veiculo(double peso, double velocMax) {
		this.peso=peso;
		this.velocMax=velocMax;
	}
	public Veiculo() {
		
	}
	public void setPeso(double peso) {
		this.peso=peso;
	}
	public double getPeso() {
		return peso;
	}
	public void setVelocMax(double velocMax) {
		this.velocMax=velocMax;
	}
	public double getVelocMax() {
		return velocMax;
	}
	
	public String toString() {
		return ("\nPeso:"+peso+"Kg"+"\nVelocidade maxima:"+velocMax+"Km/h");
	}
	
}
