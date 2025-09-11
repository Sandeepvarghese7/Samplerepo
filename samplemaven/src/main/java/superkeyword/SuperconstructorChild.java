package superkeyword;


public class SuperconstructorChild extends SuperConstructor {
	
	public SuperconstructorChild()
	{
		super(4,5);
		
		System.out.println("child");
	}

	public static void main(String[] args) {
		SuperconstructorChild obj=new SuperconstructorChild();

	}

}
