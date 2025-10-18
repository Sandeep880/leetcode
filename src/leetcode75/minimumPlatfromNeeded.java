package leetcode75;

import java.util.Arrays;

public class minimumPlatfromNeeded {

	public static void main(String[] args) {
		int arr[] = {900, 940, 950, 1100, 1500, 1800}; int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
		
		
		System.out.println(calculateMinPatforms(arr,dep ));;
		
		//System.out.println(minimumplatfrom(arr, dep));
		

	}
//	public static int minimumplatfrom(int at[], int dt[])
//	{
//		int count =1;
//		for(int i=0;i<at.length;i++)
//		{
//			for(int j=0;j<dt.length;j++)
//			{
//				if(i != j)
//				{
//					
//				}
//			}
//		}
//	}
//	
	public static int calculateMinPatforms(int at[], int dt[]) {
        // Write your code here.

		Arrays.sort(at);
		Arrays.sort(dt);
		
		int i =1;
		int j=0;
		
		int platfromneeded =1;
		int maxplatfrom = 1;
		
		while(at.length >i && dt.length >j)
		{
			if(at[i] >= dt[j]) 
			{
				platfromneeded--;
				j++;
			}
			else
			{
				platfromneeded++;
				i++;
				maxplatfrom = Math.max(platfromneeded, maxplatfrom);
			}
		}
	    return maxplatfrom;
	
	}

}
