package aggregation;

public class Aggregationtwo {
	String city;
	String state;
	Aggregationone ref;
	public Aggregationtwo(String city,String state,Aggregationone ref)
	{
		this.city=city;
		this.state=state;
		this.ref=ref;
		
	}
	public void print()
	{
		System.out.println(ref.name+""+ref.rollno);
		System.out.println("city:"+city+"State:"+state);
		
	}
	public static void main(String args[])
	{
		Aggregationone obj1=new Aggregationone("Sandeep",10);
		Aggregationtwo obj=new Aggregationtwo("Thrissur","kerala",obj1);
		obj.print();
		
		
	}

}
