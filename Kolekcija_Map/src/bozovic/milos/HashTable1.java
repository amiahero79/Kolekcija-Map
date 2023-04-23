package bozovic.milos;

import java.util.Hashtable;
import java.util.Map;

public class HashTable1 {

	public static void main(String[] args) {
		
		 Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(100,"Joca");  
		  hm.put(102,"Milos");  
		  hm.put(101,"Pera");  
		  hm.put(103,"Zaklina");  
		  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  	
		

	}

}
