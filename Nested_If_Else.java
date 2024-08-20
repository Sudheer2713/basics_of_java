package automation_batch44;
public class Nested_If_Else 
{

	public static void main(String[] args) 
	{
        String gender = "male";
        int age = 60;
        if(gender=="female")
        {
        	System.out.println("Travelling is free");
        }
        else
        {
        	if(age<=12)
        	{
        		System.out.println("Eligible for half ticket");
        	}
        	else if(age>12 && age<=59)
        	{
        		System.out.println("Eligible for full ticket");
        	}
        	else
        	{
        		System.out.println("Senior citizen and eligible for half ticket");
        	}
        }
	}

}
