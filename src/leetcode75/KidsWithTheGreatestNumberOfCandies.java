package leetcode75;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

	public static void main(String[] args) {
		int candies[] = {4,2,1,1,2}, extraCandies = 1;
		List<Boolean> kidsWithCandies = kidsWithCandies(candies, extraCandies);
		
		for(int i=0;i<candies.length;i++)
		   System.out.print(kidsWithCandies.get(i) + " ");
		

	}
	
   public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res= new ArrayList<>();
        int max = maxElement(candies);
        for(int i=0;i<candies.length;i++) 
        {
        	if(candies[i] + extraCandies >= max)
        	{
        		res.add(true);
        	}
        	else
        	{
        		res.add(false);
        	}
        }
        return res;
        
    }
   
   public static int maxElement(int arr[]) {
	   int max = Integer.MIN_VALUE;
	   for(int i=0;i<arr.length;i++)
	   {
		   max = Math.max(max, arr[i]);
	   }
	   return max;
   }

}
