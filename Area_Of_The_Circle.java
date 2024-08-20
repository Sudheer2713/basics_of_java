package automation_batch44;
import java.util.Scanner;
public class Area_Of_The_Circle 
{
    public static void main(String[] args) 
	{  
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of radius");
		Double radius = s1.nextDouble();
		double pi = 3.14;
		Double Area = pi*radius*radius;
		System.out.println("Area of the circle = "+Area);
		s1.close();
	}

}
