public class minimumcostclimbingstairs {
        public int mincostclimbingstairs(int idx,int [] cost,int []dp){
            if(idx==0) return cost[idx];
            if(idx<0) return 0;
            if(dp[idx]!=-1) return dp[idx];
            int take=cost[idx]+mincostclimbingstairs(idx-1,cost,dp);
            int nottake=cost[idx]+mincostclimbingstairs(idx-2,cost,dp);
            return dp[idx]=Math.min(take,nottake);
        }
        public int minCostClimbingStairs(int[] nums) {
            int n=nums.length;
            int []dp=new int[n+1];
            for(int i=0;i<=n;i++){
                dp[i]=-1;
            }
            return Math.min(mincostclimbingstairs(n-1,nums,dp),mincostclimbingstairs(n-2,nums,dp));
        }
    }
