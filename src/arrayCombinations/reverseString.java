package arrayCombinations;

public class reverseString {
	
	public static String reverse(String str){
		
		char ch[] = str.toCharArray();
		String reversed="";
		for(int i=ch.length-1;i>=0;i--){
			reversed = reversed+ch[i];
			
			
		}
		return reversed;
		
	}
	
	public static boolean isPalindrome(String str)
	{
		String s = reverse(str);
		if(str.equals(s))
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse("hello"));
		
		System.out.println(isPalindrome("madam"));

	}

}
