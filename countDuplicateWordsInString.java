package JavaTestSeries;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class countDuplicateWordsInString {
	public static void main(String args[]) {
		String inputstr = "This is java and java with selenium and Selenium";
		inputstr.toLowerCase();
		String words[] = inputstr.split(" ");

		Map<String, Integer> wordcount = new HashMap<String, Integer>();
		for (String word : words) {
			if (wordcount.containsKey(word)) {
				wordcount.put(word.toLowerCase(), wordcount.get(word) + 1);
			} else {
				wordcount.put(word, 1);
			}
		}

		Set<String> wordstring = wordcount.keySet();
		for (String word : wordstring) {
			if (wordcount.get(word) > 1) {
				System.out.println(word + " : " +wordcount.get(word));
			}
		}
	}
}
