package lista1;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float media=0;
		int num;
		for (int i=0; i<10; i++) {
			System.out.println("INsira o numero " +i+ ":");
			num = sc.nextInt();
			media +=num;
		}
		
		media = media/10;
		System.out.println("media:"+media);
	}

}
