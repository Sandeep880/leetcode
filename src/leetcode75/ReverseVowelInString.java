package leetcode75;

public class ReverseVowelInString {

	public static void main(String[] args) {
		String s = "IceCreAm";
		System.out.println(reverseVowels(s));

	}
	
    public static String reverseVowels(String s) {
		char[] str= s.toCharArray();
		int start=0,end = str.length-1;
		while(end>= start)
		{
			if(isVowel(str[start]) && isVowel(str[end]))
			{
				Character temp = str[start];
				str[start] = str[end];
				str[end] = temp;
				start++;
				end--;
			}
			else if(isVowel(str[start]))
				end--;
			else
				start++;
			
		}
		String res="";
		for(int i=0;i<str.length;i++)
			  res = res+ str[i];
		
    	return res;
    }
    
    private static boolean isVowel(Character c) {
    	if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
    				c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' )
    		{
    			return true;
    		}
    	else
    		return false;
    	
    }

}
