package bozovic.milos;

import java.util.HashMap;
import java.util.Map;

public class Genericka {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Maja");
		map.put(101, "Olja");
		map.put(102, "Zarko");
		// elementi mogu da se kreću bilo kojim redosledom
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
