package leetcode75;

public class MaxConsecutiveOnesIII {

	public static void main(String[] args) {
		int nums[] = {1,1,1,0,0,0,1,1,1,1,0}, k = 2;
        
		System.out.println(longestOnesS(nums, k));
		
	}
	
	public static  int longestOnes(int[] nums, int k) {
		
		int res =Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++)
		{
			int count =0;
			for(int j=i;j<nums.length;j++)
			{
				if(nums[j] == 0)
				{
					count++;
				}
				
				if(k >= count )
				  res = Math.max(j-i+1, res);
			}
		}
		
		return res;
		
	}
	
	public static  int longestOnesS(int[] nums, int k) {
//		int count=0;
//		int i=0;
//		int j=-1;
//		int res=0;
//		
//		while(nums.length >i)
//		{
//			if(nums[i] == 0)
//			{
//				count++;
//				i++;
//			}
//			else
//			{
//				i++;
//			}
//			
//			while(count >k)
//			{
//				j++;
//				if(nums[j] == 0)
//				{
//					j++;
//				}
//			}
//			res = Math.max(res, i-j+1);
//		}
//		return res;
		
		int start =0,end =0,count=0,res =0;
		
		
		while(nums.length > start )
		{
			if(nums[start] == 0)
			{
				count++;
			}
			
			while(count >k)
			{
				if(nums[end] == 0)
					count--;
				end++;		
			}
			
			res= Math.max(res, start-end + 1);
			
			start++;
			
		}
		return res;
		
	}

}
