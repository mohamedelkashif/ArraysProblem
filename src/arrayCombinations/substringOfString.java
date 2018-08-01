package arrayCombinations;

public class substringOfString {
	
	public static boolean chaeck(String s,String sub){
		
		//char s[] = s1.toCharArray();
		//char d[] = s2.toCharArray();
		int count = 0;
	    for (int i = 0; i < s.length(); i++) {
	        if (s.charAt(i) == sub.charAt(count)) {
	            count++;
	        } else {
	            count = 0;
	        }
	        if (count == sub.length()) {
	            System.out.println("Sub String");
	            return true;
	        }
//	        else
//	        	return false;

	    }
	    return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(chaeck("mohamed","moh"));

	}

}
