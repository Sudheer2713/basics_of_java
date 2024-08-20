package automation_batch44;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner_Trycatch 
{
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the age");
       try
       {
       int age = sc.nextInt();
       }
       catch(InputMismatchException P)
       {
    	   System.out.println("Please read the question again...");
           Scanner sc1 = new Scanner(System.in);
           System.out.println("Enter the age");
           int age1 = sc1.nextInt();
       }
       Scanner s = new Scanner(System.in);
       System.out.println("Enter your name");
       String name = s.next();
   }
}




//InputMismatchExcetion
