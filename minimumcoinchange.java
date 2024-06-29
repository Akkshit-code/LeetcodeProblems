public class minimumcoinchange {
    public static int mincoinchange(int []nums,int idx,int target){
        if (idx==0){
            if (target%nums[idx]==0) return target/nums[idx];
            else return Integer.MAX_VALUE;
        }
        int pick = Integer.MAX_VALUE;
        if(nums[idx]<=target) pick = 1 + mincoinchange(nums,idx,target-nums[idx]);
        int notpick = mincoinchange(nums,idx-1,target);
        return  Math.min(pick,notpick);
    }
    public static void main(String[] args) {
        int [] coins = {1,2,3};
        int target=8;
        System.out.println(mincoinchange(coins,coins.length-1,target));
    }
}
