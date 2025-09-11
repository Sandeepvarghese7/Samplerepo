package accessmodifiers;

public class Accessone {
public void display()
{
	System.out.println("public");
	
}

private void print()
{
	System.out.println("private");

}

protected void method()
{
	System.out.println("protected");
}
	public static void main(String[] args) {
		Accessone obj=new Accessone();
		obj.display();
		obj.print();
		obj.method();
		
	

	}

}
