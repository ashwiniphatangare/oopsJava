package oopsJava;
class pqr{
	int a,b;
	void getdata() {
		a=10;
		b=20;
	}
}
 class sum extends pqr{
	 int sum;
	 void sum() {
		 sum=a+b;
		 System.out.print("sum:"+sum);
	 }
 }
 
 class substract extends sum{
	 int substract;
	 void substract() {
		 substract=a-b;
		 System.out.print("substraction:"+substract);
	 }
 }
public class multilevelInheristance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		substract s=new substract();
		s.getdata();
		s.sum();
		s.substract();

	}

}
