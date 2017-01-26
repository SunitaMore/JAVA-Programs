import java.lang.*;
class fibonacci
{
	public static void main (String args[])
	{
		int num=Integer.parseInt(args[0]);
		System.out.println("fibonacci series");
		int f1,f2=0,f3=1;
		for(int i=1;i<=num;i++)
		{
			System.out.println(""+f3+"");
			f1=f2;
			f2=f3;
			f3=f1+f2;
		}
	}
}