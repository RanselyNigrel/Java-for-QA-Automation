package JavaTestSeries;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintWordsWithPrefix {

	public static void main(String[] args)
	{
		List<String> str = Arrays.asList("cab" ,"bca", "abc" , "def");
		List<String> str1= str.stream().filter(e->e.matches("bca")).collect(Collectors.toList());
		System.out.println(str1);

	}

}
