package JavaTestSeries;

import java.util.Arrays;

public class shiftZeroToRightSide {

	public static void main(String[] args)

	{
		int num[] = { 1, 3, 0, 4, 0, 0, 2 };
		int len = num.length;
		int newArray[] = new int[len];
		int count = 0;

		for (int i = 0; i < len; i++) {
			if (num[i] != 0) {
				newArray[count] = num[i];
				count++;
			}
		}
		System.out.print(Arrays.toString(newArray));

	}

}
