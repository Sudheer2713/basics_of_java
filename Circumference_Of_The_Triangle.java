package automation_batch44;
import java.util.Scanner;
public class Circumference_Of_The_Triangle 
{

	public static void main(String[] args) 
	{
      Scanner s1 = new Scanner(System.in);
      System.err.println("Enter the length of side A");
      double A = s1.nextDouble();
      System.out.println("Enter the lenght of side B");
      double B = s1.nextDouble();	
      System.out.println("Enter the value of side C");
      double C = s1.nextDouble();
      double circumference = A+B+C;
      System.out.println("Circumference of  the triangle = "+circumference);
      s1.close();
    }

}
