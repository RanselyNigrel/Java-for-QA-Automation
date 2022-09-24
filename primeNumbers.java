package JavaTestSeries;

public class primeNumbers {

	public static void main(String args[]) {
		int i, number, count;

		System.out.println("Prime Numbers from 1 to 100 are : ");
		for (number = 1; number <= 100; number++) {
			count = 0;
			for (i = 2; i < number; i++) {
				if (number % i == 0) {
					count++;
					break;
				}
			}
			if (count == 0 && number != 1) {
				System.out.print(number + " ");
			}
		}
		System.out.println("");
		System.out.println("***********************************************");
		
		int p=2 ; i = 1 ;
		int num = 10;
		int cnt , flag ;
		while (i<=num)
		{
			flag = 1 ; 
			for (cnt=2 ; cnt<p ; cnt++)
			{
				if(p%cnt==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
			{	System.out.print(p +" ");
			    i++ ;
			}
			p++ ; 
		}
		
	}

}
