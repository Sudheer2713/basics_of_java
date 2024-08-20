package automation_batch44;
import java.util.Scanner;
public class Even_Odd_Number 
{
    public static void main(String[] args) 
	{
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = s1.nextInt();
        if(a%2==0) 
        {
        	System.out.println("It is an Even Number");
        }
        else
        {
        	System.out.println("It is an Odd Number");
        }
        s1.close();
	}

}
