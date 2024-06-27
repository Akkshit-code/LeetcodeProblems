class TargetSum{
    public static int targetsum(int [] nums,int idx,int target){
        if(target ==0)return true;
        if(idx == 0) return nums[0] == target;
        boolean notTake = Targetsum(idx-1,target,nums);
        boolean Take = false;
        if(target>=nums[idx]){
            Take = Targetsum(idx-1,target-nums[idx],nums);
        }
        return Take || notTake;

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