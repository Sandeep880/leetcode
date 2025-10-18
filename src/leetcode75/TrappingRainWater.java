package leetcode75;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
		
		System.out.println(trap(height));
		
		

	}

	 public static int trap(int[] height) {
		
	    int leftmax[]= new int[height.length];
	    
	    int left = height[0];
	    leftmax[0] = left;
	    for(int i=1;i<height.length;i++)
	    {
	    	left= Math.max(left, height[i]);
	    	leftmax[i] = left;
	    }
	    
	    for(int l : leftmax)
	    {
	    	System.out.print(l + " ");
	    }
	    System.out.println();
	    
	    int rightmax[] = new int[height.length];
	    int right= height[height.length-1];
	    for(int i=height.length-2;i>=0;i--)
	    {
	    	right = Math.max(right, height[i]);
	    	rightmax[i] =right;
	    }
	    
	    for(int r : rightmax)
	    {
	    	System.out.print(r + " ");
	    }
	    
	    System.out.println();
	    
	    int trap =0;
	    
	    for(int i=1;i<height.length-1;i++)
	    {
	    	trap = trap + (Math.min(leftmax[i] , rightmax[i]) - height[i]);
	    }
	    	    
	    return trap;
	    
	    
	 }
}
