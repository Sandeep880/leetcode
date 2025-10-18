package leetcode75;

public class RemoveElement {

	public static void main(String[] args) {
		
		int nums[] = {3,2,2,3}; int val = 3;
		int count=0, k=0;
		
		int res[]= new int[nums.length];
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i] != val)
			{
				res[k++] = nums[i];
			}
		}
		
		for(int l=0;l<nums.length;l++)
			   nums[l] = res[l];
		
		System.out.println(nums.length);
		
		for(int l=0;l<nums.length;l++)
		   System.out.print(nums[l] + " ");
		

	}

}
