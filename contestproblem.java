import java.util.Arrays;

class Solution {
    public static double minimumAverage(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        float[] averages = new float[n / 2];

        int left = 0, right = n - 1;
        for (int i = 0; i < n / 2; i++) {
            averages[i] = (float)(nums[left] + nums[right]) / 2f;
            left++;
            right--;
        }

        Arrays.sort(averages);

        String formattedResult = String.format("%.1f", averages[0]);

        return Double.parseDouble(formattedResult);
    }

    public static void main(String[] args) {
        int [] nums = {1,9,8,3,10,5};
        System.out.println(minimumAverage(nums));
    }
}