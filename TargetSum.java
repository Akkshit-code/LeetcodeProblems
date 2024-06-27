class TargetSum{
    public static int targetsum(int [] nums,int idx,int target){
        if (target == 0) return 1;
        if (idx < 0) return 0;

        int notTake = targetsum(nums, idx - 1, target);
        int take = 0;
        if (target >= nums[idx]) {
            take = targetsum(nums, idx - 1, target - nums[idx]);
        }
        return take + notTake;

    }
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5};
        int totalsum=0;
        int target=4;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }
        System.out.println(targetsum(nums,nums.length-1,(totalsum-target)/2));


    }
}