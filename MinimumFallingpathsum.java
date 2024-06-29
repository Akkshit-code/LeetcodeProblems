class MinimumFallingPathsum {
    public int minSum(int i, int j, int[][]arr, int[][]dp){
        if(j<0 || j>=arr.length){
            return Integer.MAX_VALUE ;
        }
        if(i==0){
            return arr[0][j];
        }

        if(dp[i][j] !=Integer.MIN_VALUE ){
            return dp[i][j] ;
        }
        return dp[i][j] =arr[i][j] + Math.min(minSum(i-1,j,arr,dp),Math.min(minSum(i-1,j-1,arr,dp),minSum(i-1,j+1,arr,dp)));
    }
    public int minFallingPathSum(int[][] matrix) {
        int m= matrix.length ;
        int n= matrix[0].length ;
        int[][]dp =new int[m][n] ;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                dp[i][j] = Integer.MIN_VALUE ;
            }
        }
        int max= Integer.MAX_VALUE ;
        for(int i=0; i<m; i++){
            max= Math.min(max, minSum(m-1,i,matrix, dp));
        }
        return max ;

    }
}