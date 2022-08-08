
public class StudInfo implements collageData,HostelData {

	

	@Override
	public void CollegeDetail() {
		// TODO Auto-generated method stub
		System.out.println("college is pvp");
		
	}

	@Override
	public void StudentDetail() {
		// TODO Auto-generated method stub
		System.out.println("student  is arti");

		
	}

	@Override
	public void HostelData() {
		// TODO Auto-generated method stub
		System.out.println("hostel is sangamner");

		
	}

	@Override
	public void StudentRecord() {
		// TODO Auto-generated method stub
		System.out.println("stud is anil");

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudInfo s=new StudInfo();

s.CollegeDetail();
s.StudentRecord();
s.StudentDetail();
s.HostelData();
	}
}
