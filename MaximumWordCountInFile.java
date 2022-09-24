package JavaTestSeries;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MaximumWordCountInFile {

	public static void main(String[] args) {
		String path = "C:\\Users\\Ransely Nigrel\\Documents\\JavaLearning.txt";

		BufferedReader reader;

		Map<String, Integer> wordCount = new HashMap<String, Integer>();

		try {
			reader = new BufferedReader(new FileReader(path));
			String currentLine = reader.readLine();
			while (currentLine != null) {
				String words[] = currentLine.toLowerCase().split(" ");
				for (String word : words) {
					if (wordCount.containsKey(word)) {
						wordCount.put(word, wordCount.get(word) + 1);
					} else {
						wordCount.put(word, 1);
					}

				}
				currentLine = reader.readLine();
			}
			Set<Entry<String, Integer>> TotalWords = wordCount.entrySet();
			for (Entry<String, Integer> wrdcnt : TotalWords) {

				System.out.println(wrdcnt.getKey() + " :" + wrdcnt.getValue());

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
