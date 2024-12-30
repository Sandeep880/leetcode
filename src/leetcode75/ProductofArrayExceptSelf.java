package leetcode75;

public class ProductofArrayExceptSelf {

	public static void main(String[] args) {
		int nums[] = {-1,1,0,-3,3};
		int res[] = productExceptSelfEff(nums);
		for(int i=0;i<res.length;i++)
    	  System.out.print(res[i] + " ");

	}
	
    public static  int[] productExceptSelf(int[] nums) {
    	
    	int res[] = new int[nums.length];
    	
    	for(int i=0;i<nums.length;i++)
    	{
    		int mul=1;
    		for(int j=0;j<nums.length;j++)
    		{
    			if(i != j)
    			{
    				mul = mul*nums[j];
    			}
    		}
    		res[i] = mul;
    	}
    	return res;
    }
    
    public static  int[] productExceptSelfEff(int[] nums) {
    	
    	int left[]= new int[nums.length], right[] = new int[nums.length] ,prod[]= new int[nums.length];
    	
    	left[0]=1;
    	for(int i=1;i<nums.length;i++)
    	{
    		left[i]=left[i-1]*nums[i-1];
    	}
    	
    	right[nums.length-1]=1;
    	for(int i=nums.length-2;i>=0;i--)
    	{
    		right[i]= right[i+1]*nums[i+1];
    	}
    	
    	for(int i=0;i<nums.length;i++)
    	{
    		prod[i] = left[i]*right[i];
    	}
    	
    	return prod;
    	
    }

}
