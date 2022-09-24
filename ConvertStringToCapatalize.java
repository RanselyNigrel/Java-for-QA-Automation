package JavaTestSeries;

public class ConvertStringToCapatalize {
	public static String capatalizeStr(String str) {
		String words[] = str.split("\\s");
		String result = "";

		for (String w : words) {
			String first = w.substring(0, 1).toUpperCase();
			String restString = w.substring(1);
			result = result + first + restString + " "; // colon is added if spaces needed after Capitilization
		}

		return result.trim();

	}

	public static void main(String[] args) {
		String caps = capatalizeStr("ransely Java series");
		System.out.println(caps);

		String caps1 = capatalizeStr("r r r");
		System.out.println(caps1);
	}

}
