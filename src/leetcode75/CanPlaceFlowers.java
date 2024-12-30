package leetcode75;

public class CanPlaceFlowers {

	public static void main(String[] args) {
		int flowerbed[] = {0,0,1,0,1,0,0}, n = 2;
		boolean b = canPlaceFlowers(flowerbed , n);
		System.out.println(b);

	}

     public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length;i++)
        {
        	int left =  i==0 ? 0 : flowerbed[i-1];
        	int right = i==flowerbed.length-1 ? 0: flowerbed[i+1]; 
        	
        	if(left + flowerbed[i] + right == 0)
        	{
        		flowerbed[i] =1;
        		n--;
        	}
        	
        }
        return n<=0;
    }
}
