package leetcode75;

public class FindtheIndexoftheFirstOccurrenceinAString {

	public static void main(String[] args) {
		String haystack = "sapbutsad", needle = "sad";
		
		int res = strStr(haystack, needle);
		System.out.println(res);

	}
	
	public static int strStr(String haystack, String needle) {
        
		int i=0,j=0,ind=0;
		
		while(haystack.length() >i  && needle.length() >j)
		{
			ind=i;
			while(haystack.length() >i  && needle.length() >j && haystack.charAt(i) == needle.charAt(j))
			{
				i++;
				j++;
			}
			
			if(j >= needle.length())
			{
				return ind;
			}
			else
			{
				j=0;
				i = ind+1;
			}
		}
		return -1;
		
   }

}
