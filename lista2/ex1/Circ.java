package ex1;

public class Circ {
	private double raio=1;
	private String cor="vermelho";	
	private double area=1;

public Circ() {
	
}
public Circ(double raio, String cor, double area) {
	this.raio=raio;
	this.cor=cor;
	this.area=area;
}

public double getRaio(){
	return raio;
}
public void setRaio(double raio) {
	this.raio=raio;
}

public String getCor() {
	return cor;
}
public void setCor(String cor) {
	this.cor=cor;
}

public static double calcArea(double raio) {
	double area = 2*3.14*Math.pow(raio,2);
	return area;
}
public String toString(){
	return("Raio ="+raio+"\ncor="+cor+"\narea"+area);
}


}
