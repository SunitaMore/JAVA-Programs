import java.lang.*;
class Evenodd
{
		int num;
		void accept(int x)
		{
			num=x;
		}
		void check()
		{
			if(num%2==0)
			{
				System.out.println("The number is Even");
			}
			else
			{
				System.out.println("The number is Odd");
			}
		}
		public static void main(String args[])
		{
			Evenodd e = new Evenodd();
			int b = Integer.parseInt(args[0]);
			e.accept(b);
			e.check();
		}

	

}