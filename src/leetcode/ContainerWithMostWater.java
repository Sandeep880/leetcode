package leetcode;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int height[] = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));

	}
	
    public static int maxArea(int[] arr) {
        int start=0,end=arr.length-1;
        int area = Integer.MIN_VALUE;
        while(end > start)
        {
        	if(arr[start]  > arr[end])
			{
				area = Math.max( Math.min(arr[start] , arr[end])*(end - start) , area);
				end--;
			}
			else if ( arr[start]  < arr[end])
			{
				area = Math.max( Math.min(arr[start] , arr[end])*(end - start) , area);
				start++;
			}
			else
			{
				area = Math.max( Math.min(arr[start] , arr[end])*(end - start) , area);
				start++;
				end--;
			}
        }
        return area;
    }

}
