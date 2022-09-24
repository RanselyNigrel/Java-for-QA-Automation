package JavaTestSeries;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	public static int romanToInt(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
				result += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1)); // to subtract lower number
			} else {
				result += map.get(s.charAt(i));
			}
		}
		return result;
	}

	public static void main(String args[]) {

		long sum = romanToInt("MDXLVII");
		long sum1 = romanToInt("LMXDII");
		long sum2 = romanToInt("CMXCCDVI");
		System.out.println(sum);
		System.out.println(sum1);
		System.out.println(sum2);
	}

}
