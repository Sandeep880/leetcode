package leetcode75;

import java.util.Stack;

public class RemoveKDigits {

	public static void main(String[] args) {
		String num = "1432219";
		int k = 3;
		
		System.out.println(removeKdigits(num, k));
		
		

	}
	
    public static String removeKdigits(String num, int k) {
        
    	Stack<Character> stack = new Stack<>();
    	
    	for(char c : num.toCharArray())
    	{
    		while(!stack.isEmpty() && k>0 && c < stack.peek())
            {
    			stack.pop();
    			k--;
    		}
    		stack.push(c);
    	}
    	
    	while(k-- >0)
    	{
    		stack.pop();
    	}
    	StringBuilder sb = new StringBuilder();
    	for(Character c : stack)
    	{
    		sb.append(c);
    	}
    	
    	while(num.length() > 0 && sb.charAt(0) == '0')
    	{
    		sb.deleteCharAt(0);
    	}
    	
    	return sb.length() ==0 ? "0" : sb.toString();
    }

}
