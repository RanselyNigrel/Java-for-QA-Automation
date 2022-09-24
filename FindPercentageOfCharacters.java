package JavaTestSeries;

import java.text.DecimalFormat;

public class FindPercentageOfCharacters {

	public static void getCharacters(String str) {

		int len = str.length();
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int digitCount = 0;
		int specialCharCount = 0;

		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				upperCaseCount++;
			} else if (Character.isLowerCase(ch)) {
				lowerCaseCount++;
			} else if (Character.isDigit(ch)) {
				digitCount++;
			} else {
				specialCharCount++;
			}
		}
		double upperCasePercentage = (upperCaseCount * 100.0) / len;
		double lowerCasePercentage = (lowerCaseCount * 100.0) / len;
		double digitPercentage = (digitCount * 100.0) / len;
		double specialCharPercentage = (specialCharCount * 100.0) / len;

		DecimalFormat formatter = new DecimalFormat("##.##");

		System.out.println("Upper Case % --> " + formatter.format(upperCasePercentage));
		System.out.println("Lower Case % --> " + formatter.format(lowerCasePercentage));
		System.out.println("Digit % --> " + formatter.format(digitPercentage));
		System.out.println("Special Char % --> " + formatter.format(specialCharPercentage));

		System.out.println(upperCasePercentage + lowerCasePercentage + digitPercentage + specialCharPercentage);
	}

	public static void main(String args[]) {
		getCharacters("RanseL%y Java123 Se4ries");
	}

}
