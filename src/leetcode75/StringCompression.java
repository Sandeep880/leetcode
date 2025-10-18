package leetcode75;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCompression {

	public static void main(String[] args) {

		char chars[] = {'a','a','b','b','c','c','c'};
		
		System.out.println(compress(chars));
		
	}
	
	public static int compress(char[] chars) {
		
		StringBuilder sb = new StringBuilder();
		int count=1,i=0;
		for(i=1;i<chars.length;i++)
		{
			if(chars[i-1] != chars[i])
			{
				sb.append(chars[i-1]);
				if(count >1)
				{
					sb.append(count);
				}
				count=1;
			}
			else
				count++;
		}
		sb.append(chars[i-1]);
		if(count>1)
		{
			sb.append(count);
		}
		for(int j=0;j<sb.length();j++)
		{
			chars[j] = sb.charAt(j);
		}
		
		return sb.length();
	}

}
