package leetcode75;

public class MaxConsecutiveOnesIII {

	public static void main(String[] args) {
		int nums[] = {1,1,1,0,0,0,1,1,1,1,0}, k = 2;
        
		System.out.println(longestOnes(nums, k));
		
	}
	
	public static  int longestOnes(int[] nums, int k) {
		int count=0;
		int i=0;
		int j=-1;
		int res=0;
		
		while(nums.length >i)
		{
			if(nums[i] == 0)
			{
				count++;
				i++;
			}
			else
			{
				i++;
			}
			
			while(count >k)
			{
				j++;
				if(nums[j] == 0)
				{
					j++;
				}
			}
			res = Math.max(res, i-j+1);
		}
		return res;
		
	}

}
