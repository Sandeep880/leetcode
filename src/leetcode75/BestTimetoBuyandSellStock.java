   package leetcode75;

public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		
		int prices[] = {7,1,5,3,6,4};
		
//		int maxprofit = 0;
//		
//		for(int i=0;i<prices.length;i++)
//		{
//			for(int j=i+1;j<prices.length;j++)
//			{
//				maxprofit = Math.max(maxprofit, prices[j] - prices[i]);
//			}
//		}
//		
//		System.out.println(maxprofit);
		
		int minprice = Integer.MAX_VALUE;
		int maxprofit = 0;
		
		for(int i=0;i<prices.length;i++)
		{
			minprice = Math.min(minprice, prices[i]);
			maxprofit = Math.max(maxprofit, prices[i] - minprice);
		}
		
		System.out.println(maxprofit);
		
		
		
		

	}

}
