package ex2;
import java.util.Scanner;

public class MainEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Jogador[] jogador = new Jogador[40];
		int qtd;
		System.out.println("Quantidade a ser inserida:");
		qtd = sc.nextInt();
		
		for(int i=0; i<qtd;i++) {
			jogador[i]= new Jogador();
			System.out.println("Nome:");
			jogador[i].setNome(sc.next());
			System.out.println("Posiçao:");
			jogador[i].setPosi(sc.next());
			System.out.println("Nacionalidade:");
			jogador[i].setNacio(sc.next());
			System.out.println("Altura:");
			jogador[i].setAltura(sc.nextFloat());
			System.out.println("PEso:");
			jogador[i].setPeso(sc.nextFloat());
		}
		
		for(int i=0; i< jogador.length; i++) {
			if(jogador[i]!=null) {
				System.out.println("\n"+jogador[i]);
				Jogador.imc(jogador[i]);
			}
		}
	}

}
