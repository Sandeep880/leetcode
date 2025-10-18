package leetcode75;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		
		int res[] = new int[2];
		
		int nums[] = {2,7,11,15}, target = 9;
		
		res = twoSum(nums, target);
		
		System.out.println(res[0] + " " + res[1]);

	}
	
    public static int[] twoSum(int[] nums, int target) {

        int res[] = new int[2];
        
//        for(int i=0;i<nums.length;i++)
//        {
//        	for(int j=i+1;j<nums.length;j++)
//        	{
//        		if(nums[i] + nums[j] == target)
//        		{
//        			res[0] = i;
//        			res[1] = j;
//        		}
//        	}
//        }
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
        	if(map.containsKey(target - nums[i]))
        	{
        		res[1] = map.get(target - nums[i]);
        		res[0] = i;
        		return res;
        	}
        	map.put(nums[i], i);
        }
        
        return res;
    }

}
