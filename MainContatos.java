package main;
import java.util.ArrayList;
import java.util.Scanner;
import contatos.Contato;

public class MainContatos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <Contato> contatos = new ArrayList<Contato>();
		
		int op;
		int contador=0; //contar os contatos
		Contato contato;
		
		do{
			System.out.println("1-Cadastrar o contato");
			System.out.println("2-Buscar por um contato");
			System.out.println("3-Remover um contato");
			System.out.println("4-Exibir todos os contatos");
			System.out.println("5-Encerrar o programa");
			op = sc.nextInt();
			switch(op) {
			case 1:
				contatos.[contador] = new Contato();// contato = new Contato;
				System.out.println("Insira o nome:");
				contato.setNome(sc.nextLine());
				sc.nextLine();
				System.out.println("Insira o telefone 1");
				contato.setTelefone1(sc.nextInt());
				System.out.println("Insira o telefone 2");
				contato.setTelefone2(sc.nextInt());
				System.out.println("Insira o endereço");
				contato.setEndereço(sc.nextLine());
				sc.nextLine();
				System.out.println("Insira a relaçao");
				contato.setRelaçao(sc.nextLine());
				sc.nextLine();
				contatos.add(contato);
				contador++;
				break;
				
			case 2:
				String nome;
				boolean confirma=false;
				
				System.out.println("Insira o nome a ser procurado");
				nome = sc.nextLine();
				sc.nextLine();
				
				for(int i=0; i<contatos.size(); i++) {
					if(contato.comparaçao(nome)) {
						System.out.println(contatos.get(i));
						confirma = true;
					}
				}
				if (!confirma) {
					System.out.println("Não encontrado");
				}
				break;
			
			case 3:
				String remove;
				System.out.println("Insira o nome a ser removido");
				remove =sc.nextLine();
				for(int i=0; i<contatos.size(); i++) {
					if(contato.comparaçao(remove));
					contatos.remove(contato);
				}
				break;
				
			case 4:
				for(int i=0; i<contatos.size(); i++) {
					System.out.println(contatos.get(i));
				}
				break;
				
			case 5:
				System.out.println("O progama será encerrado");
				break;
				
			default:
				System.out.println("Invalido, insira novamente");
				break;
			}
			
			
		}while(op!=5);
		sc.close();

	}

}
