package prova;

public class Caminhao extends Veiculo {
	private Motor motor;
	private double toneladasMax;
	private double alturaMax;
	private double comprimento;
	
	public Caminhao() {
		
	}
	
	public Caminhao(double peso, double velocMax, Motor motor, double toneladasMax, double alturaMax, double comprimento) {
		super(peso, velocMax);
		this.motor=motor;
		this.toneladasMax=toneladasMax;
		this.alturaMax=alturaMax;
		this.comprimento=comprimento;
	}
	
	public void setMotor(int numCilindro, int potencia) {
		this.motor.setNumCilindro(numCilindro);
		this.motor.setPotencia(potencia);
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Motor getMotor() {
		return motor;
	}
	
	public double getToneladasMax() {
		return toneladasMax;
	}
	public void setToneladasMax(double toneladasMax) {
		this.toneladasMax = toneladasMax;
	}

	public double getAlturaMax() {
		return alturaMax;
	}
	public void setAlturaMax(double alturaMax) {
		this.alturaMax = alturaMax;
	}

	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	public String toString() {
		return ("\nCaminhao:"+super.toString()+"\\nCaracteristicas do Motor:"+motor+"\nToneladasMax:"+toneladasMax+
				"\nAlturaMax:"+alturaMax+"\nComprimento:"+comprimento);
	}
	
}
