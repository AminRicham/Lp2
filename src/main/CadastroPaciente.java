package cadastroPaciente;
import java.util.Scanner;
import paciente.Paciente;

public class CadastroPaciente {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op;
		int cont=0;
		Paciente[] paciente = new Paciente[3];
	
		do {
		System.out.println("Insira a opção:");
		System.out.println("1-cadastrar paciente");
		System.out.println("2-Buscar o cliente");
		System.out.println("3-Exibir todos os dados");
		System.out.println("4- sair");
		op = sc.nextInt();
		
		switch(op) {
		case 1:
			if(cont<50){
				paciente[cont] = new Paciente();
				System.out.println("Codigo");
				paciente[cont].setCodigo(sc.nextInt());
				System.out.println("Nome:");
				paciente[cont].setNome(sc.next());
				System.out.println("CPF:");
				paciente[cont].setCpf(sc.nextInt());
				System.out.println("Telefone");
				paciente[cont].setTelefone(sc.nextInt());
				cont++;
			}
			else{
				System.out.println("Numero limite de pacientes");
			}
			break;
		case 2:
			System.out.println("Insira o codigo do cliente:");
			Paciente.busca(sc.nextInt(), paciente);
				
			break;
		case 3:
			for(int i=0; i<paciente.length;i++){
				System.out.println("Paciente"+(i+1)+"\n"+paciente[i]);
			}
			break;
		case 4:
			System.out.println("O programa sera encerrado");
			break;
		default:
			System.out.println("Invalido, insira novamente\n");
			break;
		}
	}while(op!=4);
	
}
}
