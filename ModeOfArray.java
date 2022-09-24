package JavaTestSeries;

public class ModeOfArray {

	// mode is the digit with higer occurance in  a set
	public static void main(String[] args) {
		int a[] = { 1, 2, 1, 3, 3, 4, 5,3, 1, 3 };
		int maxcount = 0, maxnumber = 0;

		int len = a.length;

		for (int i = 0; i < len; i++) {
			int count = 0;
			for (int j = 0; j < len; j++) {
				if (a[j] == a[i])
					count++;
			}

			if (count > maxcount) {
				maxcount = count;
				maxnumber = a[i];

			}
			// System.out.println(" " + maxnumber);
		}

		System.out.println(" " + maxnumber);
	}
}