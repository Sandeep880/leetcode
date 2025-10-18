package leetcode75;

public class SortColor {

	public static void main(String[] args) {
		int nums[] = {2,0,2,1,1,0};
		
		sortColors(nums);
		
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i] + " ");
		}
		
	}
	
    public static void sortColors(int[] nums) {
        
    	int zeroCount=0,oneCount =0, twoCount =0;;
    	
    	for(int i=0;i<nums.length;i++)
        {
        	if(nums[i] == 0)
        		zeroCount++;
        	else if(nums[i] == 1)
        		oneCount++;
        	else
        		twoCount++;
        }
    	
    	
    	for(int i=0;i<zeroCount;i++)
    	{
    		nums[i] = 0;
    	}
    	for(int i= zeroCount;i<zeroCount + oneCount;i++)
    	{
    		nums[i] = 1;
    	}
    	for(int i=zeroCount + oneCount;i<nums.length;i++)
    	{
    		nums[i] = 2;
    	}
    	
    }

}
