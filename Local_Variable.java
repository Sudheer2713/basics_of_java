package automation_batch44;
public class Local_Variable 
{
	void add()
	{
		int a=20;//local variable
		int b=10;//local variable
		System.out.println(a+b);
	}
    void sub(String S)
	{
		int a=100;//local variable
		int b=50;//local variable
		System.out.println(a-b);
	}
    static void mul()
    {
    	int a=2;//local variable
    	int b=3;//local variable
    	System.out.println(a*b);
    }
    static void div(double d)
    {
    	int a=50;//local variable
    	int b=5;//local variable
    	System.out.println(a/b);
    }
    Local_Variable()
    {
    	String S="Sudheer";//local variable
    	System.out.println(S);
    }
	public static void main(String[] args) 
	{
        double pi=3.14;//local variable
        System.out.println(pi);
        Local_Variable L1 = new Local_Variable();
        L1.add();
        L1.sub("Hi");
        mul();
        div(1.14);
	}
}
