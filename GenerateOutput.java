package JavaTestSeries;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GenerateOutput {

	public static void main(String[] args) {
		String s = "xxxxxxxaabbbbdeyyyyy";
		String s1 = s.toLowerCase();
		int len = s1.length();

		Map<Character, Integer> mapCount = new HashMap<Character, Integer>();
		for (int i = 0; i < len; i++) {

			if (mapCount.containsKey(s1.charAt(i))) {
				int count = mapCount.get(s1.charAt(i));
				mapCount.put(s1.charAt(i), ++count);
			} else {
				mapCount.put(s1.charAt(i), 1);
			}

		}

		Set<Entry<Character, Integer>> setEntry = mapCount.entrySet();
		for (Entry<Character, Integer> c : setEntry) {
			System.out.print(c.getKey() + "" + c.getValue());
		}
	}

}
