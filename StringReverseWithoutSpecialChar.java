package JavaTestSeries;

public class StringReverseWithoutSpecialChar {
	
	public static void main(String[] args)
	{
		String str = "Ra@ns%ely$";
		char ch[]= str.toCharArray();	
		System.out.println("Input String : " + str );
		strRev(ch);
		String rev = new String(ch);
		System.out.println("Output String : " +rev );
	}
	
	public static void strRev(char str[]) 
	{
		int r = str.length-1 , l=0 ;
		
		while(l<r)
		{
			if(!Character.isAlphabetic(str[l]))
			l++;
		
			else if(!Character.isAlphabetic(str[r]))
		    r--;
		    
		    else {
		    	char temp = str[l];
		    	str[l] = str[r];
		    	str[r]=temp;
		    	l++;
		    	r--;
		    	
		    }
		    
		} 
		
	}
	

}
