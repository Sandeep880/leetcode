package leetcode75;

public class FloodFill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int image[][] = {{1,1,1},{1,1,0},{1,0,1}}, sr = 1, sc = 1, color = 2;
		
		//int res[][] = new int[image.length][image[0].length];
		
		int res[][] = floodFill(image, sr, sc, color);
		
		for(int row[] : image)
		{
			for(int pixel : row)
			{
				System.out.print(pixel + " ");
			}
			System.out.println();
		}
		
		
	}
	
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        if(image[sr][sc] == color)
        {
        	return image;
        }
        
        dfsFloodFill(image, sr, sc, image[sr][sc], color);
        
                
        return image;
          
    }

	public static void dfsFloodFill(int[][] image, int sr, int sc, int oldColor, int newColor) {
		
		if(sr< 0 || sr>= image.length || sc< 0 || sc>= image[0].length || image[sr][sc] != oldColor)
			return;
		
		image[sr][sc] = newColor;
		
		dfsFloodFill(image, sr-1, sc, oldColor, newColor);
        dfsFloodFill(image, sr+1, sc, oldColor, newColor);
        dfsFloodFill(image, sr, sc-1, oldColor, newColor);
        dfsFloodFill(image, sr, sc+1, oldColor, newColor);

		
	}
    
    
}
