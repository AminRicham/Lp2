package lista1;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float salario;
		float prestacao;
		
		System.out.println("Insira o salario:");
		salario = sc.nextFloat();
		sc.nextLine();
		System.out.println("Insira a prestaçao:");
		prestacao = sc.nextFloat();
		
		if (prestacao <= salario*0.30) {
			System.out.println("O emprestimo pode ser concedido");
		}
		else {
			System.out.println("O emprestimo nao pode ser concedido");
		}
		
		
	}

}