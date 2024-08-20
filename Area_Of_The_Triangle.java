package automation_batch44;
import java.util.Scanner;
public class Area_Of_The_Triangle 
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter length of the base of the triangle");
		double base = s1.nextDouble();
		System.out.println("Enter height of the triangle");
		double height = s1.nextDouble();
		double area_of_the_triangle = (base*height)/2;
		System.out.println("Area of the triangle = "+area_of_the_triangle);
		s1.close();
	}

}
