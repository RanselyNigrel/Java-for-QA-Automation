package JavaTestSeries;

// String to number without parseInt method

public class StringToNumberWithoutMethod {
	public static int toNumber(String str) {
		int len = str.length();
		char ch[] = str.toCharArray();
		int sum = 0;
		int zeroAscii = (int) '0';
		for (int i = 0; i < len; i++) {
			int asc = (int) ch[i];
			sum = sum * 10 + (asc - zeroAscii);
		}
		return sum;

	}

	public static void main(String args[]) {
		String str = "251";
		System.out.println(toNumber(str) + 20);
	}

}
