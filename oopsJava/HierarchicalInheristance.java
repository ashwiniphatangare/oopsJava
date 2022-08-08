package oopsJava;
class car{
	public void displayCar() {
		System.out.println("method in class car");
	}
}
class Audi extends car{
	public void displayAudi() {
		System.out.println("method in class audi");
	}
}
class BMW extends car{
	public void displaybmw() {
		System.out.println("method in class bmw");
	}
}

public class HierarchicalInheristance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audi a=new Audi();
		BMW b=new BMW();
		car c=new car();
		a.displayAudi();
		b.displaybmw();
		c.displayCar();

	}

}
