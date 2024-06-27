class Pastitonequalsubsetsum {
    public boolean equalsubsetsum(int [] nums,int idx,int sum, Boolean [][] dp){
        if(sum==0) return true;
        if(idx==0) return nums[0]==sum;
        if(dp[idx][sum]!=null) return dp[idx][sum];
        boolean nottake = equalsubsetsum(nums,idx-1,sum,dp);
        boolean take = false;
        if(sum>=nums[idx]){
            take = equalsubsetsum(nums,idx-1,sum-nums[idx],dp);
        }
        return dp[idx][sum] = take || nottake;
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        Boolean [][] dp = new Boolean[nums.length][sum+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                dp[i][j] = null;
            }
        }
        if(sum%2!=0) return false;
        return equalsubsetsum(nums,nums.length-1,sum/2,dp);
    }


}