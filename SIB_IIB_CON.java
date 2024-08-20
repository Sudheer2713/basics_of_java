package automation_batch44;
public class SIB_IIB_CON 
{
	{
		System.out.println("IIB");
	}
	{
		System.out.println("IIB 1");
	}
	static
	{
		System.out.println("SIB");
	}
	SIB_IIB_CON()
	{
		System.out.println("Constructor");
	}
	SIB_IIB_CON(int a)
	{
		System.out.println("Constructor 1");
	}
	public static void main(String[] args) 
	{
       System.out.println("Main Method");
       new SIB_IIB_CON();
       new SIB_IIB_CON(1);
	}
}
