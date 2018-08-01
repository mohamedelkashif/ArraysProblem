package arrayCombinations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinations {
	
	public static void combinations ( String[] a ) {

//		ArrayList<String> combinationList = new ArrayList<String>();
//	    for ( long i = 1; i < Math.pow(2, ports.length); i++ ) {
//	    	String temp="";
//	        for ( int j = 0; j < ports.length; j++ ) {
//	            if ( (i & (long) Math.pow(2, j)) > 0 ) {
//	           
//	            	temp+=ports[j];
//	            }
//	        }
//	        combinationList.add(temp);
//	    }
		int maxbit = 1 << a.length;

        //for each combination given by a (binary) number 'p'...
        for (int p = 1; p < maxbit; p++) {
            final List<String> res = new ArrayList<String>();

            //evaluate if array 'a' element at index 'i' is present in combination (and include it if so)
            for (int i = 0; i < a.length; i++) {
                if ((1 << i & p) > 0) {
                    res.add(a[i]);
                }
            }
            System.out.println(Arrays.toString(res.toArray()));
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr [] = {"a","b","c"};
		combinations(arr);
		
		
		
		

	}

}
