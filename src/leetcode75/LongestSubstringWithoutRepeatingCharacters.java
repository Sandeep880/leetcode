package leetcode75;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

	

	public static void main(String[] args) {
		String s = "pwwkew";
		
		int res = lengthOfLongestSubstring(s);
		System.out.println(res);

	}
	
	
    public static int lengthOfLongestSubstring(String s) {
        
    	HashSet<Character> set = new HashSet<>();
    	StringBuilder sb=  new StringBuilder();
    	
    	int start =0,end =0, res =0;
    	
    	for(end=0;end<s.length();end++)
    	{
    		while(set.contains(s.charAt(end)))
    		{
    			set.remove(s.charAt(start));
    			start++;
    		}
    		
    		set.add(s.charAt(end));
    		res = Math.max(res, end-start+1);
    	}
    	return res;
    	
    	
    }

}
