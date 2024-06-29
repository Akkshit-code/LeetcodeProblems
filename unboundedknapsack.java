public class unboundedknapsack {
    public static int knapsackproblem(int []wt,int idx,int weight,int [] value,int [][]dp){
        if(idx==0) return ((int)(weight/wt[0]))*value[0];
        int nottake=0 + knapsackproblem(wt,idx-1,weight,value,dp);
        int take=Integer.MIN_VALUE;
        if (dp[idx][weight]!=-1) return dp[idx][weight];
        if(wt[idx]<=weight){
            take=value[idx]+knapsackproblem(wt,idx,weight-wt[idx],value,dp);
        }
        return Math.max(take,nottake);
    }

    public static void main(String[] args) {
        int w=8;
        int []value={1, 5, 8, 9, 10, 17, 17, 20};
        int []wt={1,2,3,4,5,6,7,8};
        int n=value.length;
        int [][] dp=new int[n][w+1];
        for (int i=0;i<n;i++){
            for(int j=0;j<=w;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(knapsackproblem(wt,n-1,w,value,dp));
    }
}
