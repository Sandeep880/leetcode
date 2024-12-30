package leetcode75;

public class ReverseWordInString {

	public static void main(String[] args) {
		String s = "  hello            world  ";
		
		System.out.println(reverseWords(s));

	}
	
	 public static String reverseWords(String s) {
		    String res="";
		    String[] st = s.trim().split("\\s+");
		    int i=0;
	        for(i=st.length-1;i>0;i--)
	         res = res +st[i] +" ";
	        return res+st[i];
	    }

}
