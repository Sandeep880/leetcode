package leetcode75;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int nums[] = {10,9,2,5,3,7,101,18};
		
		System.out.println(lengthOfLIS(nums));
		
		

	}
	
    public static int lengthOfLIS(int[] nums) {
    	
    	int temp[] = new int[nums.length];
    	
        Arrays.fill(temp, 1);
        
        for(int i=1;i<nums.length;i++)
        {
        	for(int j=0;j<i;j++)
        	{
        		if(nums[i] > nums[j]) {
        			temp[i] = Math.max(temp[i], temp[j]+1);
        		}
        	}
        }
        int max = Integer.MIN_VALUE;
        for(int t : temp)
        {
        	max = Math.max(max, t);
        }
        
        return max;
        
    }

}
