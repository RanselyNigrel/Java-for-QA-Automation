package JavaTestSeries;

public class LeaderInArray {
	public static void findLeader(int num[]) {
		if (num.length == 1) {
			System.out.println(num[0]);
			return;
		}
		int max = num[num.length - 1];
		System.out.println(max + "");

		for (int i = num.length - 2; i >= 0; i--) {
			if (num[i] > max) {
				System.out.println(num[i]);
				max = num[i];
			}
		}

	}

	public static void main(String[] args) {
		int num[] = { 20, -1, 2, 0, 3, -4, 1 };
		findLeader(num);

		int num1[] = { -4, -4, -4 };
		findLeader(num1);
	}

}
