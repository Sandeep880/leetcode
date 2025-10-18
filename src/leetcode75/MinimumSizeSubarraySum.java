package leetcode75;

public class MinimumSizeSubarraySum {

	public static void main(String[] args) {
		
		//int target = 7, nums[] = {2,3,1,2,4,3};
		int target = 4, nums[] = {1,4,4};
		
		int res = minSubArrayLen(target, nums);
		
		System.out.println(res);
		
		
		
		

	}
	
	 public static int minSubArrayLen(int target, int[] nums) {
	        
		 int start=0, end =0, sum=0, res= Integer.MAX_VALUE;
		 
		 while(nums.length > end)
		 {
			sum += nums[end];
			
			while(sum >= target)
			{
				res = Math.min(res, end-start +1);
				sum -= nums[start];
				start++;
			}
			end++;
			 
		 }
		 return res == Integer.MAX_VALUE ? 0 : res;
	 }

}
