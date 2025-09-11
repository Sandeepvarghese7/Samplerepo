package Inheritance;

public class Multilevelchild extends MultlilevelParent {
	public void display()
	{
		System.out.println("Child ");	
	}

	public static void main(String[] args) {
		
		Multilevelchild obj=new Multilevelchild();
		obj.display();
		obj.method();
		obj.print();
		

	}

}
