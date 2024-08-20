package automation_batch44;
public class How_to_call_NonStaticMethod 
{
 void add()
 {
   int a=20;
   int b=10;
   int add=a+b;
   System.out.println(add);
 }
 void mul()
 {
  int a=2;
  int b=3;
  int mul=a*b;
  System.out.println(mul);
 }
 void message()
 {
   System.out.println("Don't give up anything so easily :)");
 }
 public static void main(String[] args) 
 {
	 How_to_call_NonStaticMethod a1 = new How_to_call_NonStaticMethod();
	 a1.add();
	 a1.mul();
	 a1.message();
 }

}
