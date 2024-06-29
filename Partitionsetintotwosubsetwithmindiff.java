public class Partitionsetintotwosubsetwithmindiff {
    public static int minsubsetdiff(int [] nums , int n,boolean [][] dp){
        for (int i=0;i<nums.length;i++) dp[i][0] = true;
        int totalsum = 0;
        for (int i=0;i<nums.length;i++) totalsum+=nums[i];
        int k = totalsum;
        dp[0][nums[0]] = true;
        // For tabulation always use the bottom up approach for the base cases
        for (int i=0;i<nums.length;i++){
            for(int j=1;j<=k;j++){
                boolean nottake = dp[i-1][j];
                boolean take = false;
                if(nums[i]<=j)  take = dp[i-1][j-nums[i]];
                dp[i][j]=nottake || take;
            }
        }

        int min = Integer.MAX_VALUE;
//        s1 -> Subset-1
//        s2 -> Subset-2

        for (int s1=0;s1<=totalsum;s1++){
            if(dp[n-1][s1] == true){
                min = Math.min(min,Math.abs(totalsum-s1)-s1);
            }
        }
        return min;
    }
    public static void main(String[] args) {

    }
}
