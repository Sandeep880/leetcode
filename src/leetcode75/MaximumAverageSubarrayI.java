package leetcode;

import java.util.ArrayList;

public class MaximumAverageSubarrayI {

	public static void main(String[] args) {
		int nums[] = {-1}, k = 1;
				
		System.out.println(findMaxAverage(nums, k));

	}
	
	public static double findMaxAverage(int[] nums, int k){
		double res=Double.NEGATIVE_INFINITY;
		int sum=0;



        for(int i=0;i<=nums.length-k;i++)
        {
	       sum =0;
	       for(int j=i;j<k+i;j++)
	        {
		       sum =sum + nums[j];
	        }
	        res = Math.max(sum, res);
         }
          
          return res;
	}

}
