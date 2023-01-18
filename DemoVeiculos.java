package prova;
import java.util.ArrayList;
import java.util.Scanner;

public class DemoVeiculos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Veiculo> veiculos= new ArrayList<Veiculo>();
		int op;
		Motor motor=new Motor();
		do {
			
			System.out.println("1-Inserir um carro de passeio");
			System.out.println("2-Inserir um Caminhão");
			System.out.println("3-Sair");
			op =sc.nextInt();
			
			switch(op) {
			case 1:
				CarroPasseio carro= new CarroPasseio();
				System.out.println("Insira o Peso:");
				carro.setPeso(sc.nextDouble());
				System.out.println("Insira a VelocMax:");
				carro.setVelocMax(sc.nextDouble());
				
				System.out.println("Insira o numCilindros do motor:");
				motor.setNumCilindro(sc.nextInt());
				System.out.println("Insira a potencia do motor:");
				motor.setPotencia(sc.nextInt());
				carro.setMotor(motor);
				sc.nextLine();
				System.out.println("Insira a Cor:");
				carro.setCor(sc.nextLine());
				sc.nextLine();
				
				System.out.println("Insira o Modelo:");
				carro.setModelo(sc.nextLine());
				veiculos.add(carro);
				break;
				
			case 2:
				Caminhao caminhao= new Caminhao();
				//Motor motor2 = new Motor();
				System.out.println("Insira o Peso:");
				caminhao.setPeso(sc.nextDouble());
				
				System.out.println("Insira a VelocMax:");
				caminhao.setVelocMax(sc.nextDouble());
				
				System.out.println("Insira o numCilindros do motor:");
				motor.setNumCilindro(sc.nextInt());
				System.out.println("Insira a potencia do motor:");
				motor.setPotencia(sc.nextInt());
				caminhao.setMotor(motor);
				
				System.out.println("Insira a toneladasMax:");
				caminhao.setToneladasMax(sc.nextDouble());
				
				System.out.println("Insira a alturaMax:");
				caminhao.setAlturaMax(sc.nextDouble());
				
				System.out.println("Insira o comprimento");
				caminhao.setComprimento(sc.nextDouble());
				
				veiculos.add(caminhao);
				break;
				
			case 3:
				System.out.println("Encerrando");
				break;
			}

		}while(op!=3);
		
	for(int i=0; i<veiculos.size();i++) {
		System.out.println("\n"+veiculos.get(i));
	}
	sc.close();
	}

}
