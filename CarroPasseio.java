package prova;

public class CarroPasseio extends Veiculo {
	private Motor motor;
	private String cor;
	private String modelo;
	
	public CarroPasseio() {
		
	}
	public CarroPasseio(double peso, double velocMax, Motor motor, String cor, String modelo) {
		super(peso, velocMax);
		this.motor=motor;
		this.cor=cor;
		this.modelo=modelo;
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
	
	public void setCor(String cor) {
		this.cor=cor;
	}
	public String getCor() {
		return cor;
	}
	
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	public String getModelo() {
		return modelo;
	}
	
	public String toString() {
		return "Carro passeio:\n"+super.toString() +"\nCaracteristicas do Motor:"+motor+"\nCor:"+cor+"\nModelo:"+modelo;
	}
	
}
