package leetcode75;

import java.util.ArrayList;

public class ShootingRange {

	public static void main(String[] args) {
		int n =5;
		
//		ArrayList<Integer> list = new ArrayList<>();
//		
//		for(int i=1;i<=n;i++)
//		{
//			list.add(i);
//		}
//		int score =0;
//		
//		while(list.size() >1)
//		{
//			ArrayList<Integer> newList =  new ArrayList<>();
//			for(int i=0;i<list.size();i++)
//			{
//				if(i % 2  == 0)
//				{
//					score += list.get(i);
//				}
//				else
//				{
//					newList.add(list.get(i));
//				}
//			}
//			list = newList;
//		}
//		System.out.println(score);
		
		
		// Pattern
		
//		5
//		54
//		543
//		5432
//		54321
		
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)
				{
				  System.out.print(j);
				}
			System.out.println();
		}
		
		
		
		

	}

}
