package main;
import java.util.Scanner;

import lp2.Paciente;

public class CadastroPaciente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op;
		int i=0;
		Paciente[] paciente = new Paciente[3];
		while(1==1){
		System.out.println("Insira a opção:");
		System.out.println("1-cadastrar paciente");
		System.out.println("2-Buscar o cliente");
		System.out.println("3-Exibir todos os dados");
		System.out.println("4- sair");
		op = sc.nextInt();
		
		switch(op) {
		case 1:
			if(i<50){
				paciente[i] = new Paciente();
				System.out.println("Codigo");
				paciente[i].setCodigo(sc.nextInt());
				System.out.println("Nome:");
				paciente[i].setNome(sc.nextLine());
				System.out.println("CPF:");
				paciente[i].setCpf(sc.nextInt());
				System.out.println("Telefone");
				paciente[i].setTelefone(sc.nextInt());
				i++;
			}
			else{
				System.out.println("Numero limite de pacientes");
			}
			break;
		case 2:
			System.out.println("Insira o codigo do cliente:");
			paciente.busca(sc.next(), paciente);
				
			break;
		case 3:
			for(int i=0; i<paciente.lenght;i++){
				System.out.println("Paciente"+i+"\n"paciente[i]);
			}
			break;
		case 4:
			System.out.println("O programa sera encerrado");
			break;
		default:
			System.out.println("Invalido");
		}
		break;
	}
		
	}

}
