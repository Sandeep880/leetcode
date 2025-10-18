package leetcode;

public class GreatestCommonDivisorofStrings {

	public static void main(String[] args) {
		String str1 = "ABCABC", str2 = "ABC";
		
		int i=0,j=0;
		String res="";
		
		while(str1.length() >i && str2.length() >j)
		{
			if(str1.charAt(i) == str2.charAt(j))
			{
				res =res + str1.charAt(i);
			}
			i++;j++;
		}
		System.out.println(res);
		

	}

}
