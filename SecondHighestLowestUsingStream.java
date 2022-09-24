package JavaTestSeries;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighestLowestUsingStream {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2, -2, 4, 56, 65, 90, 16, 12, 0, -2, 65, -3);
		int secondHighest = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(secondHighest);

		int secondLowest = list.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println(secondLowest);

	}

}
