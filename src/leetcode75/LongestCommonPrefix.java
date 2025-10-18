 package leetcode75;

import java.util.HashMap;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		String st[] = {"flower","flow","flight"};
		
		String res = longestCommonPrefix(st);
		
		System.out.println(res);
		
		
		//HashMap<Integer, Integer> map = new HashMap<>();
		
		
		

	}
	
    public static String longestCommonPrefix(String[] strs) {
        
    	StringBuilder res = new StringBuilder();
    	
    	if(strs.length == 0)
    	{
    		return "";
    	}
    	
    	for(int i=0;i<strs[0].length();i++)
    	{
    		for(int j=1;j<strs.length;j++)
    		{
    			if(i == strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i))
    				return strs[0].substring(0,i);
    		}
    	}
    	return strs[0];
    }
    
    
}
