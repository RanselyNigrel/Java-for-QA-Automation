package JavaTestSeries;

import java.util.Arrays;

public class CheckIfAnagram
{
	
	public static boolean isAnagram(String s1 , String s2) {
		String s3 = s1.replaceAll("\\s", "");
		String s4 = s2.replaceAll("\\s", "");
		if(s3.length()!=s4.length()) {
			return false;
		}
		else {
		char c1[] = s3.toLowerCase().toCharArray();
		char c2[] = s4.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);
		}
	}
	
	public static void main(String args[]) {
		System.out.println(isAnagram("cat" , "Ac  t"));
		System.out.println(isAnagram("silent" , "Listen"));
		System.out.println(isAnagram("cat" , "Ac  tt"));
	}

}
