package automation_batch44;
public class This_Keyword 
{
    int Age;
    double Salary;
    String Name;
    void Student_Details (int Age, double Salary, String Name)
    {
    	this.Age = Age;
    	this.Salary = Salary;
    	this.Name = Name;
    }
	public static void main(String[] args) 
	{
		This_Keyword t1 = new This_Keyword();
		t1.Student_Details(30, 80000, "Sudheer");
		System.out.println(t1.Age);
		System.out.println(t1.Salary);
		System.out.println(t1.Name);
	}

}
