public class Threesum {
    public static int minimumSum(int[] nums) {
        int n=nums.length;
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[j]>nums[i] && nums[j]>nums[k]){
                        sum=0;
                        sum+=(nums[i]+nums[j]+nums[k]);
                        min=Math.min(sum,min);
                    }
                }

            }
        }
        return min;
    }

    public static void main(String[] args) {
        int [] nums={8,6,1,5,3};
        System.out.println(minimumSum(nums));
    }
}

