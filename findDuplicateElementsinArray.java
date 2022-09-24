package JavaTestSeries;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class findDuplicateElementsinArray {
	public static void main(String args[]) {
		String array[] = { "Java", "Php", "Java", "Ruby", "Php" , "Php"};

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].equals(array[j])) {
					System.out.println("Duplicate Element is :" + array[i]);
				}
			}
		}

		System.out.println("*******************");
		// code using HashSet

		Set<String> store = new HashSet<String>();
		for (String name : array) {
			if (store.add(name) == false) {
				System.out.println("Duplicate Element is :" + name);
			}
		}

		System.out.println("*******************");
		// code using HashMap

		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		for (String name : array) {
			Integer count = storeMap.get(name);
			if (count == null) {
				storeMap.put(name, 1);
			} else {
				storeMap.put(name, ++count);
			}
		}
		Set<Entry<String, Integer>> entrymap = storeMap.entrySet();	
		for (Entry<String, Integer> entry : entrymap) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate Element is :" + entry.getKey() + " --> "+ entry.getValue());
			}
		}
	}

}
