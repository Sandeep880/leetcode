package leetcode;

import java.util.Arrays;

public class MaxNumberofKSumPairs {

	public static void main(String[] args) {
		int nums[] = {3,1,3,4,3}, k = 6;
		
		System.out.println(maxOperations(nums, k));

	}
	
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int start =0;
        int end = nums.length-1,res=0;
        
        while(end> start)
        {
        	if(nums[start] + nums[end] == k)
        	{
        		res++;
        		start++;
        		end--;
        	}
        	else if(nums[start] + nums[end] > k)
        	{
        		end--;
        	}
        	else
        	{
        		start++;
        	}
        	
        }
        return res;
    }

}
