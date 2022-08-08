package oopsJava;
class MinFun{
	public static int minFunction(int n1,int n2) {
		int min;
		if(n1>n2)
			min=n2;
		else
			min=n1;
		return min;
	}
	public static double minFunction(double n1,double n2) {
		double min;
		if(n1>n2)
			min=n2;
		else
			min=n1;
		return min;
	}
}
public class StaticFunctionCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int var1=17;
int var2=3;
double doublevar1=14.2;
double doublevar2=18.5;
int result1=MinFun.minFunction(var1,var2);
double result2=MinFun.minFunction(doublevar1,doublevar2);
System.out.println("the min value of integer type"+result1);
System.out.println("the min value of double type"+result2);



	}



}
//u can cll fuction by using class name double result2=classname.minFunction(doublevar1,doublevar2);
