package Skillbuilders;

public class Student 
{
	private String firstName;
	private String lastName;
	private String address;
	private int stuID;
	
	public Student()//Constructor method
	{
		firstName = "Mohammed";
		lastName = "";
		address = "";
		stuID = 0000000;
	}
	
	public Student(String f, String l, String ad, int ID)//Overload constructor
	{
		firstName = f;
		lastName = l;
		address = ad;
		stuID = ID;
	}
	
	//Accessor methods
	public String getFirstName()
	{
		return firstName;
	}
	public String getlastName()
	{
		return lastName;
	}
	public String getAddress()
	{
		return address;
	}
	public int getStudentID()
	{
		return stuID;
	}
 
	//Modifier Methods
	public void setfirstName(String f)
	{
	
		firstName = f;
	}
	public void setlastName(String l)
	{
	
		lastName = l;
	}
	public void setAddress(String a)
	{
	
		address = a;
	}
	public void stuID(int s)
	{
	
		stuID = s;
	}
}
