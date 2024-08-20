package automation_batch44;
import java.util.Scanner;
public class Area_Of_The_Trapezium 
{
	public static void main(String[] args) 
	{
       Scanner s1 = new Scanner(System.in);
       System.out.println("Enter the length of base 1");
       double a= s1.nextDouble();
       System.out.println("Enter the length of base 2");
       double b = s1.nextDouble();
       System.out.println("Enter the height of trapezium");
       double h = s1.nextDouble();
       double Area = ((a+b)/2)*h;
       System.out.println("Area of the trapezium = "+Area);
       s1.close();
	}

}
