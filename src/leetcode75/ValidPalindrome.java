package leetcode75;

public class ValidPalindrome {

	public static void main(String[] args) {
		
		String s = "A man, a plan, a canal: Panama";
		
		String str = convertString(s);
		
		System.out.println(str);
		
		System.out.println(isPalindrome(str));
		
		
	  }
	
	public static boolean isPalindrome(String str) {
		int start =0, end = str.length()-1;
		
		while(end >= start)
		{
			if(str.charAt(start) != str.charAt(end))
			{
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	private static String convertString(String s) {
		
		StringBuilder str = new StringBuilder();
		
		for(int i=0;i<s.length();i++)
		{
			char c  = s.charAt(i);
			if(c >= 65 && c <= 90)
			{
				c = (char) ((char)c + 32);
			}
			
			if((c >= 'a' && c <= 'z') || (c >= '0' && c<= '9')) 
				str.append(c);
		}
				
		return str.toString();
	}
	

}
