package leetcode75;

public class ShiftingLetter {

	public static void main(String[] args) {
		
		String s = "abc";
		int shifts[] = {3,5,9};
		
		for(int i=shifts.length-2;i>=0;i--)
		{
			shifts[i] = (shifts[i] + shifts[i+1]) %26;
		}
		
//		for(int i=0;i<s.length();i++)
//			System.out.print(shifts[i] + " ");
		
		String res = shiftingLetters(s, shifts);
		
		System.out.println(res);

	}
	
	public static String shiftingLetters(String s, int[] shifts) {
		
		char res[] = s.toCharArray();
		
//		for(int i=0;i<s.length();i++)
//		{
//			for(int j=0;j<=i;j++)
//			{
//				res[j] = (char) (((int)res[j] + shifts[i] -97)%26 +97);
//			}
//		}
		
		for(int i=0;i<s.length();i++)
		{
			res[i] = (char) (((int)res[i] + shifts[i] -97)%26 +97);
		}
		
		return new String(res);
		
//		StringBuilder res = new StringBuilder();
//		
//		for(int i=0;i<s.length();i++)
//		{ 
//			char c = (char) (((int)s.charAt(i) + shifts[i] -97)%26 +97);
//			res.append(c);
//		}

//       return new String(res);
        
    }

}
