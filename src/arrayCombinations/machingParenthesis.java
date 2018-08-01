package arrayCombinations;

import java.util.Stack;

public class machingParenthesis {
	
	public static boolean isMatching(char a, char b){
		if(a == '{'  && b == '}'){
			
			return true;
		}
		
		else if(a== '[' && b == ']'){
							
							return true;
						}
		else if(a == '('  && b== ')'){
			
			return true;
		}
		else
			return false;
		
	}
	
	public static boolean check(String str){
		Stack<Character> st = new Stack<Character>();
		
		char[] ch = str.toCharArray();
		
		for(int i=0;i<ch.length;i++){
			
			if(ch[i] == '{' || ch[i]=='[' || ch[i] == '('){
				st.push(ch[i]);
				
			}
			if(ch[i]=='}' || ch[i]==']' || ch[i]==')')
			{
				if(st.isEmpty())
				{
					return false;
				}
				else if(isMatching(st.pop(),ch[i])){
					return true;
				}
			
			}
			
		}
		if(st.isEmpty()){
			return true;
			
		}
		else
			return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "{}]";
		System.out.print(check(str));

	}

}
