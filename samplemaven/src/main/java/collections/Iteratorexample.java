package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iteratorexample {

	public static void main(String[] args) {
		Set<String>M=new HashSet<String>();
M.add("kerala");
M.add("Karanataka");
M.add("Goa");
System.out.println(M);

//Iterator object creation
Iterator it= M.iterator();
while (it.hasNext())
{
	
	System.out.println(it.next());
}
it.remove();
System.out.println(M);
}



	}


