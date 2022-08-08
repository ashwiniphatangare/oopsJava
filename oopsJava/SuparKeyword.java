package oopsJava;
class vehicle{
	int speed=80;
	vehicle(String name){
		System.out.println("vehicle clas"+name);

	}
	void message() {
		System.out.println("welcome");
	}
}
class bike extends vehicle{

	 bike(){
		 super("audi");
		System.out.println("bike clas");
		
	}
	 void message() {
		 System.out.println("welcome to java");
	 }
	void disply() {
		message();
		super.message();
	}
}
public class SuparKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
bike b=new bike();
b.disply();
	}

}
