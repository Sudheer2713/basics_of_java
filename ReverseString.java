package automation_batch44;
public class ReverseString 
{
	public static void main(String[] args) 
	{
     /*for(int i=Name.length()-1;i>=0;i--)
     {
     String S = "SUDHEER";
     System.out.print(S.charAt(i));*/
	 
	   String Name = "ABHI";
	   String ReverseName = "";
	   for(int i=Name.length()-1; i>=0; i--)
	   {
	      char c = Name.charAt(i);
	      ReverseName = ReverseName+c;
	   }
	   System.out.println("The Reverse of the given String is "+ReverseName);
     }
}

