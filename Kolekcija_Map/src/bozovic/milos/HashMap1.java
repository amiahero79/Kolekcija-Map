package bozovic.milos;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		
		//kreiranje HashMap
		 HashMap<Integer,String> map=new HashMap<Integer,String>();    
		   //dodavanje elemenata
		   map.put(1,"Mango");  
		   map.put(2,"Jabuka");    
		   map.put(3,"Banana");   
		   map.put(4,"Jagoda");  
		   //ne može dupla vrednost ključa, prikazaće poslednju vrednost
		   map.put(4,"Malina"); 
		       
		   System.out.println("Iteracija HashMap");  
		   for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  	

	}

}
