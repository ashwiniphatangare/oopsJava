package oopsJava;
class Person1{
	String name,city;
	int age;
	Person1(String n,String c,int a){
		name=n;
		city=c;
		age=a;
	}
	void display() {
		System.out.println("name ,city, age is:="+name+""+city+""+age+"");
	}
}
class Learner extends Person1{
	String course="java full stack";
	public Learner(){
		super("jhjh","jgugygiu",9);
	}
	void display() {
		System.out.println("name ,city, age is:="+name+""+city+""+age+"");

		System.out.println("course is="+course);
	}
}
public class PersonSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Person1 p=new Person1("jhjh","mxjsa",9);
Learner l=new Learner();
l.display();
	}

}
