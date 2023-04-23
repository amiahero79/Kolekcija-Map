package bozovic.milos;

import java.util.HashMap;
import java.util.Map;

public class HashMap3 {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "Maja");
		hm.put(101, "Ana");
		hm.put(102, "Jelena");
		System.out.println("Početna lista elemenata:");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("Izmenjena lista elemenata:");
		hm.replace(102, "Danica");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("Izmenjena lista elemenata:");
		hm.replace(101, "Ana", "Jasmina");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("Izmenjena lista elemenata:");
		hm.replaceAll((k, v) -> "Milos");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
