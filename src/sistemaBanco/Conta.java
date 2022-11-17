package sistemaBanco;

public class Conta {
	private int numeroConta;
	private String nomeProp;
	private int tipoConta;
	public float saldo;
	private float limite;
	
	public Conta(){
		
	}
	public Conta(int numeroConta, String nomeProp, int tipoConta, float saldo, float limite){
		this.numeroConta = numeroConta;
		this.nomeProp = nomeProp;
		this.tipoConta = tipoConta;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	// SACAR
	//DEPOSITAR
	//TRANSFERIR O VALOR ENTRE DUAS CONTAS
	//COMO USAR ESSES MODULOS NA CLASSE
	
	//CONSULTAR O SALDO
	public float getSaldo() {
		return saldo;
	}
	
	
	public String toString() {
		return ("Número da conta:"+numeroConta+"\nProprietario:"+nomeProp+
				"\nTipo de conta:"+tipoConta+"\nSaldo:"+saldo+"\nLimite:"+limite);
	}
	
}
