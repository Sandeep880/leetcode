package leetcode;

public class IsSubsequence {

	public static void main(String[] args) {
		String s = "axc", t = "ahbgdc";
		
		int sl=s.length();
		int tl=t.length();
		
		System.out.println(isSubsequence(s,t));

	}
	
	public static boolean isSubsequence(String s, String t) {
        int i=0,j=0;
		
		while(s.length()> i && t.length() > j)
		{
			if(s.charAt(i) == t.charAt(j))
			{
				i++;
				j++;
			}
			else
				j++;
		}
		
		if(s.length() == i)
		{
			return true;
		}
		return false;
	}

}
