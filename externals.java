package see;
import cie;

public class externals extends cie.internals
{
	Scanner s= new Scanner(System.in);
	public int emarks[]=new int[5];
	public externals()
	{
		System.out.println("Enter marks of all 5 courses ");
		for(int i=0;i<5;i++)
		emarks[i]=s.nextInt();
	}
	void display()
	{
		for(int i=0;i<5;i++)
		System.out.println("Course "+i+": "+(marks[i]+(0.5*emarks[i]));
	}
}