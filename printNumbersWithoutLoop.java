package JavaTestSeries;

public class printNumbersWithoutLoop
{
	
	public static void main(String[] args)
	{
		printNumbers(1);
	}
	
	public static void printNumbers(int num)
	{
		if(num<=20)
		System.out.print(num + " ");
		num++ ;
		printNumbers(num);
	}

}
