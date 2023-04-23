package bozovic.milos;

import java.util.Hashtable;

public class HashTable2 {

	public static void main(String[] args) {

		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		map.put(100, "Ana");
		map.put(102, "Jovana");
		map.put(101, "Marija");
		map.put(103, "Marija");
		System.out.println("Before remove: " + map);
		// Ukloniti vrednost sa ključem 102
		map.remove(102);
		System.out.println("After remove: " + map);

	}

}
