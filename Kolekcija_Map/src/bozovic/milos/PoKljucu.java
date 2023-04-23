package bozovic.milos;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class PoKljucu {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Pera");
		map.put(101, "Zika");
		map.put(102, "Laza");
		// Set pregled
		map.entrySet()
				// Vraća sekvencijalni tok s ovom zbirkom kao izvorom
				.stream()
				// Sortirano prema priloženom komparatoru
				.sorted(Map.Entry.comparingByKey())
				// Izvodi radnju za svaki element ovog toka
				.forEach(System.out::println);
		        
	       

	}

}
