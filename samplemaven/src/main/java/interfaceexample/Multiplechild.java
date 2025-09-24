package interfaceexample;

public class Multiplechild implements MultipleparentA,MultipleparentB {

	public static void main(String[] args) {
		Multiplechild obj=new Multiplechild();
		obj.display();
		obj.print();
		obj.show();
		

	}
public void show()
{
	System.out.println("hello");
}
public void print() {
	System.out.println("display");
	
}
public void display() {
	
	System.out.println("print");
}
}
