package JavaTestSeries;

public class MedianOfArray {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 9, 5, 17, 9, 10, 11 , 13 };

		if ((arr.length) % 2 != 0) {
			int median = arr[(arr.length) / 2];
			System.out.println(median + "");
		}

		else {
			int median = (arr[arr.length / 2] + arr[(arr.length / 2 - 1)]) / 2;
			System.out.println(median + "");
		}

	}

}
