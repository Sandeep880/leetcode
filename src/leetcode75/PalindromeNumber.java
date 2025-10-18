package leetcode75;

public class PalindromeNumber {

	public static void main(String[] args) {
		int x = 10;
		
		System.out.println(isPalindrome(x));

	}
	// without converting
    public static boolean isPalindrome(int x) {
        
    	if(x< 0 || (x%10 == 0 && x!=0))
    		return false;
    	
    	int revhalf = 0;
    	
    	while(x > revhalf)
    	{
    		int rem = x%10;
    		revhalf = revhalf*10 + rem;
    		x = x/10;
    	}
    	
    	return x==revhalf || x == revhalf/10;
    	
    	
    }
    // converting number to string
    public static boolean isPalindromeString(String str)
    {
    	int start = 0;
    	int end = str.length()-1;
    	
    	while(end > start)
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

}
