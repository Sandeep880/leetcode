package leetcode75;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		
		
		String s = "babad";
		
		System.out.println(getLongestPal(s));
			
		
		
		

	}
	
	static String getLongestPal(String s) {
		
		int start=0, maxlength=1;
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<=1;j++)
			{
				int low = i;
				int high = i+j;
				
				while(low >=0 && high <s.length() && (s.charAt(low) == s.charAt(high)))
				{
					int currLen = high-low +1;
					if(currLen > maxlength)
					{
						maxlength = currLen;
						start =low;
					}
					low--;
					high++;
				}
				
			}
		}
		
		return s.substring(start, start + maxlength);
	}


}
