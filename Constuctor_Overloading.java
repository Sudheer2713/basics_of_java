package automation_batch44;
public class Constuctor_Overloading 
{
	Constuctor_Overloading ()
	{
		System.out.println("I am non parameterized constructor");
	}
	
	Constuctor_Overloading (int a)
	{
		System.out.println("I am parameterized constructor");
	}
	
    public static void main(String[] args) 
	{
    	Constuctor_Overloading a1 = new Constuctor_Overloading();
    	Constuctor_Overloading a2 = new Constuctor_Overloading(10);
    	new Constuctor_Overloading();
    	new Constuctor_Overloading(10);
	}

}
