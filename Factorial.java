


public class Factorial
{

	public static void main(String[] args)
	{
		display(5,6,7,9,10);

	}
	public static void display(int ...values)
	{
		for(int a:values)
		{
			int z=fact(a);
			System.out.println("Factorial of "+a+"is "+z);
			
		}
		
	}
	public static int fact(int n)
	{
		int f=1;
		
			
			for(int i=1;i<=n;i++)
			{
				f=f*i;
				
			}
		
			return f;
	}

}
