package JavaTestSeries;

public class FindSubString {
	public static boolean isSubstring(String main, String sub) {
		return main.matches(".*" + sub + ".*");

	}

	public static boolean isSubstring1(String main, String sub) {
		return main.contains(sub);
	}

	public static boolean isSubstring2(String main, String sub) {
		return main.indexOf(sub) != -1; // indexOf method will return -1 if subString not available
	}

	public static void main(String args[]) {
		System.out.println(isSubstring("RanselyJava", "java"));
		System.out.println(isSubstring1("RanselyJava", "Java"));
		System.out.println(isSubstring2("RanselyJava", "java"));
	}

}
