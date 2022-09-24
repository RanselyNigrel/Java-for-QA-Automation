package JavaTestSeries;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int n1[] = { 1, 2, 3, 4, 5 };
		int n2[] = { 6, 7, 8, 9, 10 };
		
		String s1[] = { "A" , "B" , "C"};
		String s2[] = { "D" , "E" , "F"};

		IntStream n1s = Arrays.stream(n1);
		IntStream n2s = Arrays.stream(n2);

		int merged[] = IntStream.concat(n1s, n2s).toArray();
		System.out.println(Arrays.toString(merged));
		
		System.out.println("*****************************");
		
		Stream<String> first = Arrays.stream(s1);
		Stream<String> second= Arrays.stream(s2);
		Object merge1[]= Stream.concat(first, second).toArray();
		System.out.println(Arrays.toString(merge1));
		

	}

}
