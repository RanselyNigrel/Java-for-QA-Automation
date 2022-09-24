package JavaTestSeries;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class frequencyOfDigitInNumber {
	public static void getDigit(long number) {
		if (String.valueOf(number).length() == 1) {
			System.out.println(number + " ---> " + 1);
			return;
		}
		Map<Long, Integer> digitCount = new HashMap<Long, Integer>();
		while (number != 0) {
			long lastdigit = number % 10;
			if (digitCount.containsKey(lastdigit)) {
				digitCount.put(lastdigit, digitCount.get(lastdigit) + 1);
			} else {
				digitCount.put(lastdigit, 1);
			}
			number = number / 10;
		}
		Set<Long> digitFreq = digitCount.keySet();
		for (long digit : digitFreq) {
			System.out.println(digit + " ----> " + digitCount.get(digit));
		}
	}

	public static void main(String[] args) {
		getDigit(1345883748623l);
	}

}
