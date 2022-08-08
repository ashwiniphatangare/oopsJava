package oopsJava;
class Student1{
	int Rollno;
	String Name;
	String city;

public Student1(int r,String n,String c){
	Rollno=r;
	Name=n;
	city=c;
}
public Student1(String n,String c){
	
	Name=n;
	city=c;
}
void getStudentData() {
	System.out.println("rollno:="+Rollno+"name:="+Name+"city=:"+city+"");
}
}
public class ConstructorOverloadingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1=new Student1(1,"hgfh","hgjh");
		Student1 s2=new Student1("kkkkkhgfh","hlllllllllgjh");
s1.getStudentData();
s2.getStudentData();

	}

}
