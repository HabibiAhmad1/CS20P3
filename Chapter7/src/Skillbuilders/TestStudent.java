package Skillbuilders;

public class TestStudent 
{

	public static void main(String[] args) 
	{
		Student stA = new Student();
		
		System.out.println(stA.getFirstName());
		stA.setfirstName("AAA");
		System.out.println(stA.getFirstName());
		stA.stuID(89186002);;
		System.out.println(stA.getStudentID());
	}

}
