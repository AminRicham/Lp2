package main;
import java.util.Scanner;
import java.util.ArrayList;
import equipamento.EquipamentoSonoro;

public class TesteEquip {

	public static void main(String[] args) {
		/*Equipamento e1 = new Equipamento("Meu");
		EquipamentoSonoro e2= new EquipamentoSonoro();
		EquipamentoSonoro e3= new EquipamentoSonoro("Arroz", (short) 3);
		
		System.out.println(e1+ "\n\n\n"+ e2+"\n\n\n"+e3);
		e3.setVolume((short) 11);
		e3.liga();
		System.out.println("\n\n"+e3);
		*/
		Scanner sc = new Scanner(System.in);
		ArrayList<EquipamentoSonoro> equipSom = new ArrayList<EquipamentoSonoro>();
		int op;
		EquipamentoSonoro equip;
		do {
			System.out.println("\n1-Inserir novo equipamento sonoro");
			System.out.println("2-Remover equipamento sonoro");
			System.out.println("3-Mostrar lista de equipamentos sonoros");
			System.out.println("4-Encontrar equipamento pelo nome");
			System.out.println("5-Ligar equipamento de escolha");
			System.out.println("6-Sair\n");
			op=sc.nextInt();
			switch (op) {
			case 1:
				equip = new EquipamentoSonoro();
				System.out.println("Insira o nome do equip sonoro");
				sc.nextLine();
				equip.setNome(sc.nextLine());
				equipSom.add(equip);
				break;
			case 2:
				String nomeRemocao;
				System.out.println("Insira o nome a ser removido");
				sc.nextLine();
				nomeRemocao=sc.nextLine();
				for(int i=0; i<equipSom.size(); i++) {
					if(equipSom.get(i).getNome().equals(nomeRemocao)) {
						equipSom.remove(i);
					}
				}
				break;
			case 3:
				for(int i=0; i<equipSom.size(); i++) {
					System.out.println(equipSom.get(i));
				}
				break;
			case 4:
				String nomeProcura;
				System.out.println("Insira o nome a ser encontrado");
				sc.nextLine();
				nomeProcura=sc.nextLine();
				for(int i=0; i<equipSom.size(); i++) {
					if(equipSom.get(i).getNome().equals(nomeProcura)) {
						System.out.println(equipSom.get(i));
					}
				}
				break;
			case 5:
				String nomeLiga;
				System.out.println("Insira o nome a ser ligado");
				sc.nextLine();
				nomeLiga = sc.nextLine();
				for(int i=0; i<equipSom.size(); i++) {
					if(equipSom.get(i).getNome().equals(nomeLiga)) {
						equipSom.get(i).liga();
					}
				}
				break;
			case 6:
				System.out.println("O programa sera encerrado");
				break;
				
			}
			
		}while(op!=6);
		
		sc.close();
	}

}
