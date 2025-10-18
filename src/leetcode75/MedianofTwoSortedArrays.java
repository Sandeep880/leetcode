package leetcode75;

public class MedianofTwoSortedArrays {

	public static void main(String[] args) {
		int nums1[] = {1,2}, nums2[] = {3,4};
		
		System.out.println(findMedianSortedArrays(nums1, nums2));
		
		

	}
	
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	
    	int i=0, j=0, k=0;
    	
    	int res[] = new int[nums1.length + nums2.length];
    	
    	while(nums1.length > i && nums2.length > j)
    	{
    		if(nums1[i] < nums2[j])
    		{
    			res[k++] = nums1[i++];
    		}
    		else
    		{
    			res[k++] = nums2[j++];
    		}
    	}
    	
    	while(nums1.length > i)
    	{
    		res[k++] = nums1[i++];
    	}
    	
    	while(nums2.length > j)
    	{
    		res[k++] = nums2[j++];
    	}
    	
    	for(int l=0;l< res.length;l++)
    	{
    		System.out.print(res[l] + " ");
    	}
    	
    	int n = res.length;
    	
    	if(n%2 != 0)
    	{
    		return res[res.length/2];
    	}
    	
    	return (res[n/2 -1] + res[n/2])/2.0;
    	
    	
    	
        
    }

}
