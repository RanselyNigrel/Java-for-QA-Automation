package JavaTestSeries;

public class PyramidLogic {

	public static void main(String[] args) 
	{
	   int aplha= 65 ;
	   for(int i=0 ; i<=4;i++) {
		   for(int j=0 ; j<=i ;j++) {
			   System.out.print((char)(aplha + j)+ " ");
		   }
		   System.out.println();
		   //aplha++;
	   }

	}

}
