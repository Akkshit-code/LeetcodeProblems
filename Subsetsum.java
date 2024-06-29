public class Subsetsum {
    public static boolean Targetsum(int idx,int target,int [] nums , boolean [][] dp){

//        // Recursive approach
//        if(target ==0)return true;
//        if(idx == 0) return nums[0] == target;
//        boolean notTake = Targetsum(idx-1,target,nums);
//        boolean Take = false;
//        if(target>=nums[idx]){
//            Take = Targetsum(idx-1,target-nums[idx],nums);
//        }
//        return Take || notTake;

        // Tabulation -> Always bottom-up approach for the base cases
        for (int i=0;i<nums.length;i++) dp[i][0] = true;
            dp[0][nums[0]] = true;
        // For tabulation always use the bottom up approach for the base cases
        for (int i=1;i<nums.length;i++){
            for(int j=1;j<=target;j++){
                boolean nottake = dp[i-1][j];
                boolean take = false;
                if(nums[i]<=target)  take = dp[i-1][target-nums[i]];
                dp[i][j]=nottake || take;
            }
        }
        return dp[nums.length-1][target];

    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        int target = 5;
        boolean [][] dp = new boolean[nums.length][target+1];

        System.out.println(Targetsum(nums.length-1,target,nums,dp));
    }
}
