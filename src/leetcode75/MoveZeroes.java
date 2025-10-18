package leetcode;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {0,1,0,3,12};
		
		int count=0,k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] >0)
            {
               nums[k]=nums[i];
               k++;
            }
            count++;
        }
        for(int j=k;j<nums.length;j++)
        {
        	nums[j]=0;
        }
        
        for(int p=0;p<nums.length;p++)
        {
        	System.out.print(nums[p]+ " ");
        }

	}

}
