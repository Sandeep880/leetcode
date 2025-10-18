package leetcode75;

import java.util.ArrayList;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "   fly me   to   the moon  ";
		
//		String words[] = s.trim().split("\\s+");
//
//        return words[words.length-1].length();
		
		
		ArrayList<String> lis = new ArrayList<>();
		String w="";
		
		for(char c : s.trim().toCharArray())
		{
			if(c == ' ')
			{
				lis.add(w);
				w="";
			}
			else
			{
				w += c;
			}
		}
		if (!w.isEmpty()) 
		    lis.add(w);
		
		//lis.forEach(n -> System.out.print(n));
		
		System.out.println(lis.get(lis.size()-1).length());
		
		
		
		
		

	}

}
