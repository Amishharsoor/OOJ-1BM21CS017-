package cie;
import java.util.Scanner;

public class internals extends cie.student
{
	Scanner s= new Scanner(System.in);
	public int marks[]=new int[5];
	public internals()
	{
		System.out.println("Enter marks of all 5 courses ");
		for(int i=0;i<5;i++)
		marks[i]=s.nextInt();
	}
}