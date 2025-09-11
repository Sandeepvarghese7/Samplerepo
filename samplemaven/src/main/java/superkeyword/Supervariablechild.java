package superkeyword;

public class Supervariablechild extends Supervariable {
	
	String s="blue";
	public void display()
	{
		System.out.println(s);
		System.out.println(super.s);
	}

	public static void main(String[] args) {
		Supervariablechild obj= new Supervariablechild();
		obj.display();

	}

}
