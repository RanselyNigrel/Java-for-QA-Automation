package JavaTestSeries;

public class SecondLargestInArray {

	public static void main(String[] args) {
		int a[] = { 23, 12, 15, 54, 10, 99 };
		int len = a.length;
		int first = 0, second = 0;
		int firstMin = a[0], secondMin = a[0];

		for (int i = 0; i < len; i++) {
			if (a[i] > first) {
				second = first;
				first = a[i];
			} else if (a[i] < firstMin) {
				secondMin = firstMin;
				firstMin = a[i];
			}
		}

		System.out.println(second + "");
		System.out.println(secondMin + "");

	}

}
