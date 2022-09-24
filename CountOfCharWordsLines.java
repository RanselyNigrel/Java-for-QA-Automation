package JavaTestSeries;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountOfCharWordsLines {

	public static void main(String[] args) {
		String Path = "C:\\Users\\Ransely Nigrel\\Documents\\JavaLearning.txt";
		int lineCount = 0;
		int charCount = 0;
		int wordCount = 0;

		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(Path));
			String currLine = reader.readLine();

			while (currLine != null) {
				lineCount++;

				String words[] = currLine.split(" ");
				wordCount = wordCount + words.length;

				for (String word : words) {
					charCount = charCount + word.length();
				}
				currLine = reader.readLine();
			}

			System.out.println("LinesCount ---> " +lineCount);
			System.out.println("WordsCount ---> " +wordCount);
			System.out.println("CharsCount ---> " +charCount);

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
