package excemptionhandling;

public class Excemptionexsampleone {
	
	public static void main (String[] args)
	{
	int a=10;
	int b=0;
	try {
		int sum=a/b;	
	}
/*catch (ArithmeticException e)
	{
	b=2;
	int c=a/b;
	System.out.println(c);
	System.out.println(e);
	}*/
	
	finally {
		b=2;
		int c=a/b;
		System.out.println(c);
		
	}

	
}

	


}
