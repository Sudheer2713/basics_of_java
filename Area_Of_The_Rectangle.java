package automation_batch44;
import java.util.Scanner;
public class Area_Of_The_Rectangle 
{

	public static void main(String[] args) 
	{
      Scanner s1 = new Scanner(System.in);
      System.out.println("Enter length of the rectangle");
      double length = s1.nextDouble();
      System.out.println("Enter bredth of the rectangle");
      double bredth = s1.nextDouble();
      double area = length*bredth;
      System.out.println("Area of the rectangle = "+area);
      s1.close();
	}

}
