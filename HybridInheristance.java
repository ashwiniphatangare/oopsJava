class D implements B,C{

	@Override
	public void Getc() {
		// TODO Auto-generated method stub
		System.out.println("method in b");
	}

	@Override
	public void getData() {
		// TODO Auto-generated method stub
		System.out.println("method in c");

	}
	
}
public class HybridInheristance{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
D d=new D();
d.Getc();
d.getData();
	}

}
