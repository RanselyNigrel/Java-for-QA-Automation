package JavaTestSeries;

public class CheckIfBinaryNumber {
	public static void isBinary(int num) {
		boolean binarynum = true;
		int cpyNum = num;

		while (cpyNum != 0) {
			int rem = cpyNum % 10;
			if (rem > 1) {
				binarynum = false;
				break;
			} else {
				cpyNum = cpyNum / 10;
			}
		}
		if (binarynum) {
			System.out.println(num + " is a Binary number");
		} else {
			System.out.println(num + " is not a Binary number");
		}
	}

	public static void main(String args[]) {
		isBinary(1011);
		isBinary(1);
		isBinary(0);
		isBinary(2011);
	}

}
