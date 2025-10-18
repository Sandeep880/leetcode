package leetcode75;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		int nums[] = {4,5,6,7,0,1,2}, target = 0;
		
		//int res = search(nums, target);
		
		int pivot = pivotIndex(nums);
		
		System.out.println(pivot);
		System.out.println(search(nums, target));

	}

    public static int search(int[] nums, int target) {
    	
    	int pivot = pivotIndex(nums);
    	
    	if(nums[pivot] <= target && target <= nums[nums.length - 1])
    	{
    		return searchInArray(nums, target, pivot, nums.length-1);
    	}
    	else
    	{
    		return searchInArray(nums, target, 0, pivot-1);
    	}
    	
    	
    	
    	
        
    }
    
    public static int searchInArray(int nums[], int target, int  start, int end)
    {
    	while(end >= start)
    	{
    		int mid = start + (end- start) /2;
    		
    		if(nums[mid] == target)
    			return mid;
    		
    		if(nums[mid] > target)
    		{
    			end =  mid-1;
    		}
    		else
    			start = mid+1;
    	}
    	return -1;
    	
    	
    	
    }
    
    public static int pivotIndex(int nums[]) {
    	
//    	int min = Integer.MAX_VALUE;
//    	int index = -1;
//    	
//    	for(int i=0;i<nums.length;i++)
//    	{
//    		if(nums[i] < min)
//    		{
//    			min = nums[i];
//    			index = i;
//    		}
//    	}
//    	return index;
    	
    	int start =0, end =nums.length-1;
    	
    	while(end > start)
    	{
    		int mid = (start + end)/2;
    		
    		if(nums[mid] > nums[end])
    			start = mid+1;
    		else
    			end = mid;
    	}
    	
    	return start;
    	
    }
}
