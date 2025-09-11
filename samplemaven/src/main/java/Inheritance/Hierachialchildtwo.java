package Inheritance;

public class Hierachialchildtwo extends Hierarchialparent{
	public void method()
	{
		System.out.println("Childtwo ");	
	}

	public static void main(String[] args) {
		Hierachialchildtwo obj=new Hierachialchildtwo();
		obj.print();
		obj.method();
	}}
	
