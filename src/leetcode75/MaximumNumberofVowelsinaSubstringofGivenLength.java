package leetcode75;

public class MaximumNumberofVowelsinaSubstringofGivenLength {

	public static void main(String[] args) {
		String s = "leetcode";
		int k = 3;
		
		System.out.println(maxVowels(s, k));
		

	}
    // this taking time , better to just count vowel don't add in curr str
    public static int maxVowels(String s, int k) {
        StringBuilder currStr = new StringBuilder();
        int res = Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<k;i++)
        {
        	
        	if(isVowel(s.charAt(i)))
        	{
        		count++;
        	}
        }
        res = Math.max(res, count);
        for(int j=k;j<s.length();j++)
        {
        	
        	if(isVowel(s.charAt(j)))
        	{
        		count++;
        	}
        	if(isVowel(s.charAt(j-k)))
        	{
        		count--;
        	}
        	res = Math.max(res, count);
        }
        
        return res;
    }
    
    public static boolean isVowel(Character c) {
    	if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'	)
    		{
    			return true;
    		}
    	
    	return false;	
    }
}
