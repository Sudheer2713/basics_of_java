package automation_batch44;
import java.util.Scanner;
public class Scanner_Class_Arithmetic_Operations
{
    public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = s1.nextInt();
		System.out.println("Enter the value of b");
		int b = s1.nextInt();
		int sum = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		int mod = a%b;
		System.out.println("Sum of a and b is "+sum);
		System.out.println("Subtraction of a and b is "+sub);
		System.out.println("Multiplication of a and b is "+mul);
		System.out.println("Division of a and b is "+div);
		System.out.println("Modulus of a and b is "+mod);
        s1.close(); //closes the scanner
	}

}
