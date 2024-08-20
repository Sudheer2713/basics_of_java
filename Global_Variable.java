package automation_batch44;
public class Global_Variable 
{
    static double pi=3.14;//static global variable
    int a=10;//non static global variable
    long b;//non static global variable without initilization
    void method()
    {
    	System.out.println(a);
    }
    Global_Variable()
    {
    	System.out.println(pi);
    }
	public static void main(String[] args) 
	{   
		System.out.println(pi);
		pi=5.55;//updating value of global static variable
		System.out.println(pi);
		Global_Variable g1 = new Global_Variable();
		System.out.println(g1.b);
		g1.a=200;//updating non static global variable
		System.out.println(g1.a);
	}

}
