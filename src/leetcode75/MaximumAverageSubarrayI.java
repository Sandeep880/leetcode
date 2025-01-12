package leetcode75;

public class MaximumAverageSubarrayI {

	public static void main(String[] args) {
		int nums[] = {5}, k = 1;
		
		//System.out.println(findMaxAverage(nums, k));
		System.out.println(findMaxAverageEff(nums, k));

	}
	
	public static double findMaxAverageEff(int[] nums, int k){
		int sum =0;
		for(int i=0;i<k;i++)
		{
			sum += nums[i];
		}
		int currSum= sum;
		for(int i=k;i<nums.length;i++)
		{
			currSum += nums[i] - nums[i-k];
			sum = Math.max(sum, currSum);
		}
		
		return sum;
	}
	
	public static double findMaxAverage(int[] nums, int k){
		double res = Double.NEGATIVE_INFINITY;
		int sum=0;
		
		for(int i=0;i<=nums.length-k;i++)
		{
			sum =0;
			for(int j=i;j<i+k;j++)
			{
				sum = sum+ nums[j];
			}
			res= Math.max(sum, res);
		}
		return res;
	}

}
