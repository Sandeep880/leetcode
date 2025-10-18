package leetcode75;

import java.util.ArrayList;

public class FindFirstandLastPositionofElementinSortedArray {

	public static void main(String[] args) {
		
		int nums[] = {5,7,7,8,8,10}, target = 8;
		
//		int res[] = {-1, -1};
//		
//		int res1 = binarysearch(nums, 0, nums.length-1, target);
//		int res2 = binarysearch(nums, 0, nums.length-1, target);
//		
//		if(res1 != -1 && res2 != -1)
//		{
//			res[0] = res1;
//			res[1] = res2;
//		}
		
		ArrayList<Integer> res = search(nums , target);
		
		System.out.println(res.get(0) + " " + res.get(1));

	}
	
	public static ArrayList<Integer> search(int nums[], int target)
	{
		int first =-1;
		int second =-1;
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i] != target)
				continue;
			
			if(first == -1)
				first = i;
			
			second = i;
		}
		
		ArrayList<Integer> res = new ArrayList<>();
		
		res.add(first);
		res.add(second);
		
		 return res;
	}
	
	
    public static int binarysearch(int[] nums, int start, int end, int target)
    {
        while(end >= start)
        {
            int mid = (start+end)/2;

            if(nums[mid] == target)
             return mid;
            else if(nums[mid] > target)
            {
                return binarysearch(nums, start, mid-1, target);
            }
            else
            {
                return binarysearch(nums, mid+1, end, target);
            }
        }
        return -1;
    }

}
