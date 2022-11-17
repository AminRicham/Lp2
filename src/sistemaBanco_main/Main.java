package sistemaBanco_main;

import sistemaBanco.Conta;

public class Main {

	public static void main(String[] args) {
		Conta c1, c2;
		c1 = new Conta(1, "Vitor", 2, 150, 4);
		c2 = new Conta(2, "Lucas", 2, 100, 3);
		
		//TESTE DE IMPRESSAO
		System.out.println("conta1:\n"+c1);
		System.out.println("\nConta2:\n"+c2); 
		
		//Depositar(c1, 50);
		//Sacar(c2,-4);
		Transferir(c1,c2, 32);
		
		System.out.println("\nNova conta N1:\n"+c1);
		System.out.println("\nnova conta:\n"+c2);
	}
	
	//DEPOSITO
	public static void Depositar(Conta conta, float valor) {
		conta.saldo = conta.getSaldo() + valor;
		System.out.println("O valor R$"+valor+" foi depositado.");
	}
	
	//SAQUE
	public static void Sacar(Conta conta, float valor) {
		if(valor<=conta.saldo && valor>0) {
			conta.saldo = conta.saldo - valor;			
			System.out.println("O valor R$"+valor+" foi sacado.");
		}
		else
			System.out.println("Operaçao invalida.");
	}
	
	//TRANSFERENCIA
	public static void Transferir(Conta conta1, Conta conta2, float valor) {
		conta1.saldo = conta1.saldo-valor;
		conta2.saldo =conta2.saldo+valor;
	}
}

//COMO USAR AS OPERAÇOES DA CLASSE CONTA NO MAIN.(DEPOSITAR, SACAR...)
