package bozovic.milos;

import java.util.Hashtable;

public class HashTable3 {

	public static void main(String[] args) {

		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		map.put(100, "Joca");
		map.put(102, "Pera");
		map.put(101, "Zika");
		map.put(103, "Aca");
		System.out.println("Initial Map: " + map);
		// Unesi, ako ne postoji
		map.putIfAbsent(104, "Igor");
		System.out.println("Updated Map: " + map);
		// Vrati trenutnu vrednost ako postoji
		map.putIfAbsent(101, "Zika");
		System.out.println("Updated Map: " + map);

	}

}
