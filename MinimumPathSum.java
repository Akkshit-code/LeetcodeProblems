public class MinimumPathSum {
    public static int minpathsum(int [][] grid,int m,int n){
        if(m==0 && n==0) return grid[0][0];
        if(m<0 || n<0) return 0;
        int min3 = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        min = Math.min(min,grid[m][n]+minpathsum(grid,m-1,n));
        min2 = Math.min(min2,grid[m][n]+minpathsum(grid,m,n-1));
        return Math.min(min,min2);
    }
    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        return minpathsum(grid,m-1,n-1);
    }

    public static void main(String[] args) {
        int [][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid));
    }
}

