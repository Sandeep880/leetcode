package leetcode75;

import java.util.HashMap;
import java.util.Map.Entry;

public class RansomNote {

	public static void main(String[] args) {
		String ransomNote = "aa";
    	String magazine = "ab";
    	
    	System.out.println(canConstruct(ransomNote, magazine));
    	

	}
	
    public static boolean canConstruct(String ransomNote, String magazine) {
        
    	HashMap<Character, Integer> map = new HashMap<>();
    	
    	for(int i=0;i<magazine.length();i++)
    	{
    		map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0)+1);
    	}
    	
//    	for(Entry<Character, Integer> e : map.entrySet())
//    	{
//    		System.out.println(e.getKey() + " " + e.getValue());
//    	}
    	
    	for(char c  : ransomNote.toCharArray())
    	{
    		int freq = map.getOrDefault(c, 0);
    		if(freq <= 0 )
    		{
    			return false;
    		}
    		
    		map.put(c , freq-1);
    	}
    	
    	
    	
    	return true;
    	
    	
    }

}
