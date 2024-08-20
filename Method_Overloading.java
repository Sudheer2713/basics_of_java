package automation_batch44;
public class Method_Overloading 
{
   static void add()
   {
	 int a=10;
	 int b=20;
	 int addition = a+b;
	 System.out.println(addition);
   }
   static void add(String s)
   {
	 System.out.println(s);
   }
   void add (int a)
   {
	  System.out.println("I am Non Static Method with arguments");
   }
	
   public static void main(String[] args) 
   {
      add();
      add("SUDHEER");
      Method_Overloading a1 = new Method_Overloading();
      a1.add(100);
   }

}
