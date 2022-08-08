class Learner{
	String name;
String Course;
	Learner(){
		String name="Ashwini";
		String Course="java";
		System.out.println("name and course is:"+name+""+Course+"");
	}
	Learner(String n,String c){
		String name=n;
		String Course=c;
		System.out.println("name and course is:"+name+""+Course+"");

	}
	Learner(Learner l4){
		 name = l4.name;
  Course = l4.Course;
		
		System.out.println("name and course is:"+name+""+Course+"");
	}
	

public class ExampleOfCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Learner l=new Learner();
 Learner l2=new Learner("ash","kir");
 Learner l3=new Learner(l2);
	}

}
}
