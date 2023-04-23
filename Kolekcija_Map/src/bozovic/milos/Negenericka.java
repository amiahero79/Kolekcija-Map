package bozovic.milos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Negenericka {

	public static void main(String[] args) {

		Map map = new HashMap();
		// dodavanje elemenata u mapu
		map.put(1, "Milos");
		map.put(5, "Milan");
		map.put(2, "Dragana");
		map.put(6, "Kostana");
		// prolazak kroz mapu
		// Konvertovanje u Set kako bismo mogli da prolazimo
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			// Konvertovanje u Map.Entry kako bismo mogli da dobijemo odvojeno ključ i vrednost
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
