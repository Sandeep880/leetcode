package leetcode;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCompression {

	public static void main(String[] args) {
//		String str[] = {"a","a","b","b","c","c","c","d"};
//		StringBuilder res= new StringBuilder();
//		int count=1,i;
//		for(i=1;i<str.length;i++)
//		{
//			if(str[i-1] != str[i])
//			{
//				if(count>1)
//                {
//                    res.append(str[i-1]);
//                }
//				res.append(count);
//				count=1;
//			}
//			else
//			{
//				count++;
//			}
//		}
//		if(count>1)
//		{
//			res.append(count);
//		}
//		res.append(str[i-1]);
//		for(int j=0;j<res.length();j++)
//        {
//            str[j] = res.charAt(j)+"";
//        }
//		System.out.println(str);
//		System.out.println(res);
//		System.out.println(res.length());
		
		List<Integer> list=  List.of(1,2,3,4,4,5);
		
		Map<Integer, Object> collect = list.stream().distinct().collect(Collectors.toMap(Function.identity(), n->n*n));
				
				//map(n -> n*n).collect(Collectors.toList());
		
		System.out.println(collect);

	}

}
