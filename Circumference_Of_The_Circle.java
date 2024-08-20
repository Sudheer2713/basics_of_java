package automation_batch44;
import java.util.Scanner;
public class Circumference_Of_The_Circle 
{
    public static void main(String[] args) 
	{
                Scanner s1 = new Scanner(System.in);
                System.out.println("Enter the value of radius");
                double radius = s1.nextDouble();
                double pi = 3.14;
                double Circumference = 2*pi*radius;
                System.out.println("Circumfrence of the Circle is "+Circumference);
               s1.close();
	}

}
