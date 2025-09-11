package superkeyword;

public class Supermethodchild extends supermethod{
	
	public void print()
	{
		System.out.println("superchild");
		super.display();
	}

	public static void main(String[] args) {
		Supermethodchild obj= new Supermethodchild();
		obj.print();
		

	}

}
