package automation_batch44;
import java.util.Scanner;
public class Switch_Case 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Select 1 for Chrome Browser");
		System.out.println("Select 2 for Firefox Browser");
		System.out.println("Select 3 for Edge Browser");
		int Browser_Selection = sc.nextInt();
		switch(Browser_Selection)
		{
		case 1: System.out.println ("Launch the Chrome Browser");
		break;
		case 2: System.out.println("Launch the Firefox Browser");
		break;
		case 3: System.out.println("Launch the Edge Browser");
		break;
		default: System.out.println("Invalid Selection");
		sc.close();
		}
	}
}
