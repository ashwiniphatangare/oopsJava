package oopsJava;

class Calculation{
	public float sum(float a,int b) {
		return a+b;
	}
	public int sum(int a,int b,int c) {
		return a+b+c;
	}
}
public class OverLoadingFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation c=new Calculation();
		System.out.println("sum"+c.sum(46.7f, 7));
		

	}

}
