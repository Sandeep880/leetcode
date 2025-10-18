package leetcode75;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses {

	public static void main(String[] args) {
		String s = "))((";
		
		System.out.println(minRemoveToMakeValid(s));
		
		
	}
	
    public static String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> set = new HashSet<>();
        
        for(int i=0;i<s.length();i++)
        {
        	char c = s.charAt(i);
        	if(c == '(')
        		stack.push(i);
        	else if(c == ')')
        	{
        		if(!stack.isEmpty())
        		{
        			stack.pop();
        		}
        		else
            	{
            		set.add(i);
            	}
        	}
        	
        }
        while(!stack.isEmpty())
        {
        	set.add(stack.pop());
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
        	
        	if(!set.contains(i))
        	{
        		sb.append(s.charAt(i));
        	}
        }
        
        return sb.toString();
    }

}
