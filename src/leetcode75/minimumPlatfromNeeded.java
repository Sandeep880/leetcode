package leetcode75;

import java.util.Arrays;

public class minimumPlatfromNeeded {

	public static void main(String[] args) {
		int arr[] = {900, 940}; int dep[] = {910, 1200};
		
		
		System.out.println(calculateMinPatforms(arr,dep ));;
		

	}
	
	public static int calculateMinPatforms(int at[], int dt[]) {
        // Write your code here.

        Arrays.sort(at);
        Arrays.sort(dt);

        int i=1,j=0,count=1;
        int res=0;

        while(at.length>i && dt.length >j)
        {
            if(dt[j] >= at[i])
            {
              count++;
              i++;
            }
            else if(dt[j] < at[i])
            {
                count--;
                j++;
            }
            res = Math.max(res, count);
        }
        return res;
    }

}
