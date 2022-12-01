package ex1_main;

import ex1.Circ;
public class Circ_Main {

	public static void main(String[] args) {
		Circ c1, c2;
		
		c1 = new Circ();
		c2 = new Circ();
		c2.setCor("azul");
		c2.setRaio(3);
		
		System.out.println("cor:"+c2.getCor()+" \nraio:"+ c2.getRaio());
		System.out.println("area:"+c1);
		

	}

}
