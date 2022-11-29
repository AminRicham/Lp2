package lista1;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,aux=0;
		
		for(int i=0; i<=5; i++ ) {
			System.out.println("Insira o numero "+i+":");
			num = sc.nextInt();
			
			if(i==0) {
				aux=num;
			}
			else {
				if(aux<=num) {
					aux=num;
				}
			}
		}
		System.out.println("O maior numero é:"+aux);
	}

}
