package exe3;

public class Triangulo {
	public int l1;
	public int l2;
	public int l3;
	
	

	public String tipo() {
		if(l1==l2 && l1==l3) {
			//System.out.println("O triangulo é equilatero");
			return ("equilatero");
		}
		else {
			if(l1==l2 || l1==l3 || l3==l2){
				//System.out.println("O triangulo é isosceles");
				return("Isosceles");
			}
			else {
				//System.out.println("O triangulo é escaleno");
				return("Escaleno");
			}
		}
	}
	public String toString() {
		return("L1"+l1+"\nL2"+l2+"\nL3"+l3+"\nTipo:"+tipo());
	}
	public  Triangulo() {
		
	}
	public  Triangulo(int l1, int l2, int l3) {
		this.l1=l1;
		this.l2=l2;
		this.l3=l3;
	}
	public void setL1(int l1) {
		this.l1=l1;
	}
	public int getL1() {
		return l1;
	}
	public int getL2() {
		return l2;
	}
	public void setL2(int l2) {
		this.l2 = l2;
	}
	public int getL3() {
		return l3;
	}
	public void setL3(int l3) {
		this.l3 = l3;
	}
}
