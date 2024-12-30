package leetcode75;

public class IncreasingTripletSubsequence {

	public static void main(String[] args) {
		int nums[] = {2,1,5,0,4,6};
		
		System.out.println(increasingTriplet(nums));
		System.out.println(increasingTripletEff(nums));

	}
	
    private static boolean increasingTripletEff(int[] nums) {
       int first = Integer.MAX_VALUE;
       int sec = Integer.MAX_VALUE;
       for(int num : nums)
       {
    	   if(first >= num)
    	   {
    		   first = num;
    	   }
    	   else if(sec >= num)
    	   {
    		   sec = num;
    	   }
    	   else
    		   return true;
       }
       return false;
	}

	public static boolean increasingTriplet(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
        	for(int j=0;j<nums.length;j++)
        	{
        		for(int k=0;k<nums.length;k++)
        		{
        			if(nums[i]< nums[j] && nums[j] < nums[k] && i< j && j < k)
        			{
        				return true;
        			}
        		}
        	}
        }
        return false;
    }

}
