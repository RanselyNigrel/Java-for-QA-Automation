package JavaTestSeries;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateUsingStreams {

	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(1,3,1,4,6,2,3,21,34,21,0,1,0,34);
		Set<Integer> dup = list.stream().filter(e->Collections.frequency(list, e)>1).collect(Collectors.toSet()); // To print duplicate Numbers
        System.out.println(dup);
        
        Set<Integer> dup1 = list.stream().filter(e->Collections.frequency(list, e)==1).collect(Collectors.toSet()); // To print non duplicate Numbers
        System.out.println(dup1);
        
        Set<Integer> dupSet = new HashSet<Integer>();
        
        /*Set<Integer> dupSet1 = list.stream().filter(e-> !dupSet.add(e) ).collect(Collectors.toSet());
        System.out.println(dupSet1);*/
        
        Set<Integer> dupSet2 = list.stream().filter(n-> dupSet.add(n) ).collect(Collectors.toSet()); // To Print unique numbers
        System.out.println(dupSet2);
	}

}
