package JavaTestSeries;

public class CheckIfPangram {
	public static boolean checkPangram(String str) {
		boolean mark[] = new boolean[26];

		int index = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				index = str.charAt(i) - 'A';
				mark[index] = true;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				index = str.charAt(i) - 'a';
				mark[index] = true;
			}
		}
		for (int i = 0; i <= 25; i++)
			if (!mark[i]) {
				return false;
			}
		return true;

	}

	public static void main(String args[]) {
		boolean iFPangram = checkPangram("The quick brown fox Jumps over the Lazy dog");
		boolean iFPangram1 = checkPangram("Ransely Java Series");
		System.out.println(iFPangram);
		System.out.println(iFPangram1);
	}

}
