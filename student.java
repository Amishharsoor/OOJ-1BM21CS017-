package cie;
import java.util.Scanner;


public class student
{
	Scanner s= new Scanner(System.in);
	public String usn=new String();
	public String name=new String();	
	public int sem;
	public student()
	{
		System.out.println("Enter USN, Name and Semester ");
		usn=s.nextLine();
		name=s.nextLine();
		sem=s.nextInt();
	}		
}
