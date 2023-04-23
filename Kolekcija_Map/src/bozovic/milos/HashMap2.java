package bozovic.milos;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {

	public static void main(String[] args) {
	
		HashMap<Integer,String> hm=new HashMap<Integer,String>();    
	    System.out.println("Početna lista elemenata: "+ hm);  
	      hm.put(100,"Joca");    
	      hm.put(101,"Joka");    
	      hm.put(102,"Jole");   
	       
	      System.out.println("Nakon ubacivanja put() metodom ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }  
	        
	      hm.putIfAbsent(103, "Joksa");  
	      System.out.println("Nakon ubacivanja putIfAbsent() metodom ");  
	      for(Map.Entry m:hm.entrySet()){    
	           System.out.println(m.getKey()+" "+m.getValue());    
	          }  
	      HashMap<Integer,String> map=new HashMap<Integer,String>();  
	      map.put(104,"Jova");  
	      map.putAll(hm);  
	      System.out.println("Nakon ubacivanja putAll() metodom ");  
	      for(Map.Entry m:map.entrySet()){    
	           System.out.println(m.getKey()+" "+m.getValue());    
	          }  	
	    //izbacivanje po ključu 
	      map.remove(100);  
	      System.out.println("Nakon izbacivanja: "+ map);  
	      //izbacivanje po vrednosti nije moguće 
	      map.remove("Joka");  
	      System.out.println("Nakon izbacivanja: "+map);  
	      //izbacivanje po ključu i vrednosti 
	      map.remove(102, "Jole");  
	      System.out.println("Nakon izbacivanja: "+map);  
	      
	}

}
