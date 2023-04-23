package bozovic.milos;

import java.util.HashMap;
import java.util.Map;

public class PoVrednosti {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(742, "Caca");
		map.put(353, "Cica");
		map.put(124, "Coka");
		// Set pregled
		map.entrySet()
				// Vraća sekvencijalni tok s ovom zbirkom kao izvorom
				.stream()
				// Sortiram prema izabranom komparatoru
				.sorted(Map.Entry.comparingByValue())
				// za svaki element
				.forEach(System.out::println);

	}

}
