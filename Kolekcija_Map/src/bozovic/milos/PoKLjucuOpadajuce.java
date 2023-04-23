package bozovic.milos;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class PoKLjucuOpadajuce {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(345, "Draza");
		map.put(267, "Lana");
		map.put(483, "Nadezda");
		// Set pregled
		map.entrySet()
				// Vraća sekvencijalni tok s ovom zbirkom kao izvorom
				.stream()
				// Sortirano prema priloženom komparatoru
				.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				// Izvodi radnju za svaki element ovog toka
				.forEach(System.out::println);

	}

}
