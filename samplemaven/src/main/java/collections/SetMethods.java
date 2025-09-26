package collections;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
	Set<String> S=new HashSet<String>();
	Set <String> N=new HashSet<String>();
	
	
	//add method
	S.add("Green");
    S.add("Blue");
    S.add("White");
    S.add("Red");
  //add all method
    N.add("green");
    N.add("yellow");
    S.addAll(N);
    System.out.println(S);
    
    
   //contains
    System.out.println(S.contains("yellow"));
    
    //containsAll
    
    
    System.out.println(S.containsAll(N));
    
    
    //IsEmpty
    
    System.out.println(N.isEmpty());
    
    
    //remove
    N.remove("green");
    System.out.println(N);
    
    //removeAll
    S.removeAll(N);
    System.out.println(S);
    
    //Size
    
    
    System.out.println(S.size());
    
    //clear
    
    N.clear();
    System.out.println(N);
    
    
    
    
    
    
    
    
    
    
    
    
  
    
    
    
	
	
	

	}

}
