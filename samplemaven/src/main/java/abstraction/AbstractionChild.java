package abstraction;

public class AbstractionChild extends Abstractparent  {

public static void main(String args[])
{
	AbstractionChild obj= new AbstractionChild();
	obj.display();
	obj.print();
	
}

@Override
public void display() {
System.out.println("hello");
	
}

}