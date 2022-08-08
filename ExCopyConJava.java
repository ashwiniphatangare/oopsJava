class StudLearn{
	String name;
String Course;
StudLearn(){
		String name="Ashwini";
		String Course="java";
		System.out.println("name and course is:"+name+""+Course+"");
	}
StudLearn(String n,String c){
		 name=n;
		Course=c;
		System.out.println("name and course is:"+name+""+Course+"");

	}
StudLearn(StudLearn l4){
		 name = l4.name;
  Course = l4.Course;
		
	System.out.println("name and course is:"+name+""+Course);
	}
	
}
public class ExCopyConJava {

	public static void main(String[] args) {
		System.out.println("helloe");
		// TODO Auto-generated method stub
		StudLearn l=new StudLearn();
		StudLearn l2=new StudLearn("ash","kir");
		StudLearn l3=new StudLearn(l2);
	}

}
//}

