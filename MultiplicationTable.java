import java.lang.*;
class MultiplicationTable
{
	public static void main(String args[])
	{
		int num = Integer.parseInt(args[0]);
		System.out.println("\n ****Multiplication Table****");
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num;j++)
			{
				System.out.print(" "+i*j+" ");
			}
			System.out.print("\n");

		}
	}
}
			