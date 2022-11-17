package sistemaBanco_main;
import java.util.Scanner;
import sistemaBanco.Conta;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Conta c1, c2;
		c1 = new Conta(1, "Vitor", 2, 150, 4);
		c2 = new Conta(2, "Lucas", 2, 100, 3);
		
		/*
		//TESTE DE IMPRESSAO e FUNCOES
		System.out.println("conta1:\n"+c1);
		System.out.println("\nConta2:\n"+c2); 
		
		//Depositar(c1, 50);
		//Sacar(c2,-4);
		//Transferir(c1,c2, 32);
		
		System.out.println("\nNova conta N1:\n"+c1);
		System.out.println("\nnova conta:\n"+c2);
		*/
		
		float conta;
		System.out.println("Qual o numero de sua conta?")
		conta = sc.extInt();
		if (conta != c1.getNumeroConta() || conta.getNumeroConta() != c2)
			System.out.println("Conta invalida");
		else{
		
		int escolha;
		System.out.println("Boa tarde, insira a operacao desejada, sendo elas
				   1-Sacar, 2-Depositar, 3-Transferir valor, 4-Consultar saldo");
		float valor;	   
		switch(escolha){
			case 1:
			System.out.println("Insira o valor a ser sacado de sua conta:")
			valor = sc.nextFloat();
			Sacar(conta,valor);
			sc.nextFloat:
			
			case 2:
			System.out.println("Insira o valor a ser depositado em sua conta:");
			valor = sc.nextFloat();
			Depositar(conta,valor);
			sc.nextFloat();
			
			case 3:
			System.out.println("Insira a conta a ser depositada");
			conta2 = sc.nextInt();
			System.out.println("Insira o valor a ser depositado:");
			valor = sc.nextFloat();
			//FAZER CHECAGEM DE CONTA2
			Transferir(conta1,conta2, valor);
			
			case 4:
			System.out.println("O saldo da conta "+conta1+" é:"+ conta1.getSaldo());
			
		}//else		
		
		
		
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
