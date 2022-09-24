package JavaTestSeries;

public class RemoveWhiteSpaceInString {

	public static void main(String[] args) {
		String str = "  This is Java " + " \n After the session " + " \t  w'll have Tea ";

		int len = str.length();
		String noSpace = "";

		for (int i = 0; i < len; i++) {
			if ((str.charAt(i)) != ' ' && (str.charAt(i) != '\t')) {
				noSpace = noSpace + str.charAt(i);
			}
		}

		System.out.println(noSpace);

	}

}
