package leetcode75;
import java.util.*;

public class ThreeSum {

	public static void main(String[] args) {
		
		int nums[] = {-1,0,1,2,-1,-4};
		
		
		List<List<Integer>> res = threeSum(nums);
		
		System.out.println(res);

	}
	
    
    public static List<List<Integer>> threeSum(int[] nums) {
    	
    	List<List<Integer>> res = new ArrayList<>();
    	
    	Arrays.sort(nums);
    	
    	for(int i=0;i<nums.length-2;i++)
    	{
    		
    		if(i>0 && nums[i] == nums[i-1]) continue;
    		
    		int left = i+1;
    		int right = nums.length-1;
    		while(right > left)
    		{
    			if(nums[i] + nums[left] + nums[right] == 0 )
    			{
    				res.add(Arrays.asList(nums[i], nums[left], nums[right]));
    				while(right> left && nums[left] == nums[left+1]) left++;
    				while(right> left && nums[right]== nums[right-1]) right--;
    				left++;
    				right--;
    			}
    			else if(nums[i] + nums[left] + nums[right] > 0)
    			{
    				right--;
    			}
    			else
    			{
    				left++;
    			}
    				
    		}
    		
    	 }
    	
    	return res;
        
    }

}
