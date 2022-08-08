package oopsJava;
class Car{
	String brand;

 Car(){
	brand="sdsdc";
	System.out.println(brand);
}
void getBrand() {
	System.out.println("brand="+brand);
}
}
public class OopsJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Car ms=new Car();
       ms.getBrand();
       
	}

}
