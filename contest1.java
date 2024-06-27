class contest1{
    public static int minimumOperations(int[] nums) {
        int n = nums.length;
        int total = 0;
        for (int i=0;i<n;i++){
            if(nums[i]%3 != 0) total++;
        }
        return total;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        System.out.println(minimumOperations(nums));
    }
}