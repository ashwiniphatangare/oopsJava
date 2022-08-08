package oopsJava;

import java.util.Scanner;

class Student{
	
	int Rollno;
	String Name,city;
	Student(){
		Rollno=1;
		Name="nhbj";
		city="jkj";
	}
	Student(int Rollno,String Name,String city){
		this.Rollno=Rollno;
		this.Name=Name;
		this.city=city;
		
	}
	void getStudentData() {
		System.out.println("rollno"+Rollno+""+Name+""+city+"");
	}
	
	
}
public class ConStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter stud info");
		int rollno=sc.nextInt();
		String name=sc.nextLine();
		String city=sc.nextLine();
		Student s=new Student();
		s.getStudentData();
		Student s1=new Student(rollno,name,city);
		s1.getStudentData();


	}

}
