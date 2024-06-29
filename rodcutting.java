public class rodcutting {
    public static int knapsackproblem(int idx,int length,int [] value,int [][]dp){
        if (idx < 0 || length <= 0)
            return 0;
        int nottake=0+knapsackproblem(idx-1,length,value,dp);
        int take=Integer.MIN_VALUE;
        if (dp[idx][length]!=-1) return dp[idx][length];
        if((idx+1)<=length){
            take=value[idx]+knapsackproblem(idx,length-(idx+1),value,dp);
        }
        return dp[idx][length]=Math.max(take,nottake);
    }

    public static void main(String[] args) {
        int N=8;
        int []value={3, 5, 8, 9, 10, 17, 17, 20};
        int n=value.length;
        int [][] dp=new int[n][N+1];
        for (int i=0;i<n;i++){
            for(int j=0;j<=N;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(knapsackproblem(n-1,N,value,dp));
    }
}
