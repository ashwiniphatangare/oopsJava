package oopsJava;
abstract class myclass{
	abstract void calculate(double x);
}
class SquareOfshape extends myclass{
	void calculate(double x) {
		System.out.println("square:"+(x*x));
	}
}
class SquareRootOfshape extends myclass{
	void calculate(double x) {
		System.out.println("squareRoot:"+Math.sqrt(x));
	}
}
public class AbstractClassEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquareOfshape s=new SquareOfshape();
    s.calculate(5);
    SquareRootOfshape sq=new SquareRootOfshape();
    sq.calculate(8);
    myclass reference;//myclass mc=new myclass();  abstract class cannot be instanciated
    reference=s;
    s.calculate(7);
	}

}
