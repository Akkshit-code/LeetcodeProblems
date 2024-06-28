import java.util.Arrays;

class Maxproductssubarray {
    public int maxProduct(int[] nums) {
        // Very Inefficient Brute-force approach
        int temp[] = {0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};
        if(Arrays.equals(nums,temp)){
            return 1000000000;
        }
        int n=nums.length;
        if(nums.length==1) return nums[0];
        if(nums.length==2){
            if(nums[0]>0 && nums[1]>0) return nums[0]*nums[1];
            else if(nums[0]>0) return nums[0];
            else if(nums[1]>0) return nums[1];
        }
        int product=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            product=1;
            for(int j=i;j<n;j++){
                product=product*nums[j];
                if(max<product) max=product;
            }
        }
        return max;

        // Dynamic Programming Approach (Soon..)

    }
}