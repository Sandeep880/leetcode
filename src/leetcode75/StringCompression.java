package leetcode75;

public class StringCompression {

	public static void main(String[] args) {
		String str[]  = {"a","a","b","b","z","c","c","c","d","d","e"};
		StringBuilder res = new StringBuilder();
		int count=1,i=0;
		for(i=1;i<str.length;i++)
		{
			if(str[i-1] != str[i])
			{
				res.append(str[i-1]+"");
				if(count>1)
					res.append(count+"");
				count=1;
				
			}
			else
			{
				count++;
			}
		}
		res.append(str[i-1]);
		if(count>1)
			res.append(count);

		System.out.println(res);

	}

}
