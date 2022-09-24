package JavaTestSeries;

public class WordsInCapatalizeString {

	public static void main(String[] args)
	{
		String str = "thisRanselyIsLearningJavaseries" ;
		int len = str.length();
		int count =0;
		
		for(int i=0 ; i<len ; i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				count ++ ;
			}
		}
		System.out.println(count +"");
		
		System.out.println("**********");
		
		int count1=0;
		for(int i=0 ; i<len ; i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				count1 ++ ;
			}
		}
		System.out.println(count1 +"");
	}

}
