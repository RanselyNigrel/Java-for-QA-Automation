package JavaTestSeries;

public class ReverseFirstHalfOfArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 , 10 , 12 ,13 , 15 };
		int len = arr.length;
		//System.out.println(len +"");
		for (int i = 0; i < len / 4; i++) {
			int temp = arr[i];
			arr[i] = arr[len/2 -i - 1];
			arr[len/2 -i - 1] = temp;
		}

		for (int j = 0; j < len; j++) {
			System.out.print(arr[j] +" ");
		}

	}
}
