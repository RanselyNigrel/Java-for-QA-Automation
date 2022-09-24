package JavaTestSeries;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfEachNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 20, 25, 11, 6);
		list.stream().map(n -> (n * n)).filter(n -> n > 100).forEach(num -> System.out.println(num));

		List<Integer> list1 = Arrays.asList(1, 20, 35, 211, 66, -222, 234, 33, 231);
		List<Integer> numWith2 = list1.stream().map(e -> String.valueOf(e)).filter(e -> e.startsWith("2"))
				.map(e -> Integer.parseInt(e)).collect(Collectors.toList());
		System.out.println(numWith2);
	}

}
