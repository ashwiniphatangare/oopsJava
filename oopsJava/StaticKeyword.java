package oopsJava;
class StudentClass{
	String name;
	static String college="edubridge";
	int roll;
	static int count=0;
	StudentClass(int r,String n){
		roll=r;
		name=n;
		count++;
		System.out.println(count);

	}
	void disply(){
		System.out.println("name,college and roll no is="+roll+""+name+""+college+""+StudentClass.count);
	}
}
public class StaticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentClass s=new StudentClass('8',"jyjyy");
		StudentClass s1=new StudentClass('8',"jyjyy");

		StudentClass s3=new StudentClass('8',"jyjyy");

s.disply();
	}

}
