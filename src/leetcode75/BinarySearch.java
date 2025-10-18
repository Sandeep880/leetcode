package leetcode75;



public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {-1,0,3,5,9,12}, target = 9;
		
		int res = search(nums, target);
		
		System.out.println(res);

	}
	
	 public static int search(int[] nums, int target) {

	        int start =0;
	        int end = nums.length-1;

	        int res = searchResult(nums, start, end, target);
	        
	        return res;
	        
	    }

	public static int searchResult(int[] nums, int start, int end, int target) {
		
		if(start > end)
		{
			return -1;
		}
		
		int mid = (start + end)/2;
		
		if(nums[mid] == target)
		{
			return mid;
		}
		
		if(nums[mid] > target)
		{
			return searchResult(nums, start, mid-1, target);
		}
		else
		{
			return searchResult(nums, mid+1, end, target);
		}
		
		
		
		
	}

}
