package automation_batch44;
public class Calling_Static_And_NonStatic_Methods 
{
  static void add()
  {
	 int a=100;
	 int b=200;
	 int addition=a+b;
	 System.out.println(addition);
  }
  
  void mul()
  {
	int a=10;
	int b=20;
	int mul=a*b;
	System.out.println(mul);
  }
	
 public static void main(String[] args) 
	{
     add();
     Calling_Static_And_NonStatic_Methods a1=new Calling_Static_And_NonStatic_Methods();
     a1.mul();
	}

}
