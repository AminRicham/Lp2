package main;
import java.util.Scanner;
import pais.Pais;
//CRIAR UM ARRAUY DE PAISES CADASTRAR ENQUNATO DESEJAR E EXIBIR NO FINAL

public class MainPaises {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qntd;
		
		System.out.println("Quantos paises vc deseja inserir:");
		qntd = sc.nextInt();
		
		Pais[] paises = new Pais[qntd];
		
		for(int i=0; i<qntd; i++) {
			paises[i] = new Pais();
			System.out.println("Nome do pais"+(i+1)+":");
			paises[i].setNome(sc.next());
			System.out.println("Dimensao do pais"+(i+1)+":");
			paises[i].setDimen(sc.nextInt());
			System.out.println("Pop do pais"+(i+1)+":");
			paises[i].setPop(sc.nextInt());
		}
		
		for(int i=0; i<qntd; i++) {
			System.out.println(paises[i]);
			
		}
	}

}
