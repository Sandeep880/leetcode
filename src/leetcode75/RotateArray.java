package leetcode75;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {1,2,3,4,5,6,7}, k = 3;
		
		k = k%nums.length;
		
		
//		while( k-- >0) {
//		 int temp = nums[nums.length-1];
//		for(int i=nums.length-1;i>0;i--)
//		{
//			nums[i] = nums[i-1];
//		}
//		nums[0] = temp;
//		
//		}
		
		reverse(nums , 0 , nums.length-k-1);
		reverse(nums, nums.length-k , nums.length-1);
		
		reverse(nums, 0, nums.length-1);
		
		for(int i=0;i<nums.length;i++)
			System.out.print(nums[i] + " ");

	}
	
	public static void reverse(int nums[], int start, int end)
	{
		while(end > start)
		{
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			end--;
			start++;
		}
	}

}
