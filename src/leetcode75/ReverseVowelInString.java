package leetcode75;

public class ReverseVowelInString {

	public static void main(String[] args) {
		String s = "IceCreAm";
		System.out.println(reverseVowels(s));

	}
	
    public static String reverseVowels(String s) {
		char[] str= s.toCharArray();
		for(int i=0;i<str.length;i++)
		  System.out.print(str[i] + " ");
    	return "";
    }

}
