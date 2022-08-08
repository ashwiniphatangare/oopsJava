package oopsJava;
class employee{

}
class PermanantEmp extends employee{
	int salary=20000;
	public void displayEmp() {
	double increament;
	 increament=salary+(salary*10)/100;
	System.out.println("sal after increamet"+increament);
	}
}
class TemporaryEmp extends employee{
	int salary=80;
	
	public void displaysal() {
		double increament;
		 increament=salary+(salary*10)/100;
		System.out.println("sal after increamet"+increament);
	}	
}
public class HierarchicalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermanantEmp pe=new PermanantEmp();
		pe.displayEmp();
		TemporaryEmp te=new TemporaryEmp();
		te.displaysal();
	}

}
