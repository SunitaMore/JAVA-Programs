import java.lang.*;
class Factorial
{
	public static void main(String args[])
	{
		int num = Integer.parseInt(args[0]);
		int result = 1;
		while(num>0)
		{
			result = result*num;
			num--;
		}
	System.out.println("factorial of given no is:"+result);
	}
}