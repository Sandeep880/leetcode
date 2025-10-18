package leetcode75;

public class LongestSubarrayof1sAfterDeletingOneElement {

	public static void main(String[] args) {
		 
		int nums[] = {0,1,1,1,0,1,1,0,1};
		
		int start =0, end =0, res =0, count=0;
		
		while(nums.length > end)
		{
			if(nums[end] == 0)
			{
				count++;
			}
			
			while(count > 1)
			{
				if(nums[start] == 0)
				{
					count--;
				}
				start++;
			}
			
			res = Math.max(res, end-start);
			end++;
		}
		
		System.out.println(res);
		
		
	}

}
