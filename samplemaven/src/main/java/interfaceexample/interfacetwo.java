package interfaceexample;

public class interfacetwo implements Interfaceone {

	
	public static void main(String[] args) {
		interfacetwo obj=new interfacetwo();
		obj.display();
		obj.print();
}

	public void display() {
		System.out.println("hello");
		
	}

	public void print() {
		System.out.println("display");
		
	}
}