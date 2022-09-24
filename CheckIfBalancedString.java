package JavaTestSeries;

public class CheckIfBalancedString {
	public static boolean isValid(String str) {
		if (str == null || str.length() == 0) {
			return true;
		}
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				count++;
				System.out.println(count);
			} else if (ch == ')' || ch == ']' || ch == '}') {
				if (count == 0) {
					return false;
				} else {
					count--;
					System.out.println(count);

				}
			}

		}

		if (count != 0) {
			return false;
		}
		return true;

	}

	public static void main(String args[]) {
		String str = "())()123)abc{}[";
		System.out.println(isValid(str));
	}

}
