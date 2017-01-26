import java.io.*;
import java.lang.*;
class Employee
{
	String name;
	String id;
	int salary;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	void get()
	{
		try
		{
			System.out.println("Enter the name");
			name=br.readLine();
			System.out.println("Enter the id:");
			id=br.readLine();
			System.out.println("Enter the salary:");
			salary=Integer.parseInt(br.readLine());
		}
		catch(Exception ex)
		{
			System.out.println("ex");
		}
		System.out.println("The name is:"+name);
		System.out.println("The id is:"+id);
		System.out.println("The salary is:"+salary);
	}
}
class Program2
{
	public static void main(String args[])
	{
		Employee e[]=new Employee[5];
		for(int i=0;i<5;i++)
		{
			e[i]=new Employee();
		}
		for(int i=0;i<5;i++)
		{
			e[i].get();
		}
		/*for(int i=0;i<5;i++)
		{
			e[i].show();
		}*/
	}
}