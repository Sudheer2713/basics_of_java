package automation_batch44;

public class How_to_call_StaticMethod 
{
    static void addition()
    {
      System.out.println("I am addition method");
    }
    static void subtraction()
    {
      System.out.println("I am subtraction method");
    }
    static void multiplication() 
    {
      System.out.println("I am multiplication method");	
    }
	public static void main(String[] args) 
	{
      System.out.println("I am main method");
      addition();
      subtraction();
      multiplication();
	}

}
