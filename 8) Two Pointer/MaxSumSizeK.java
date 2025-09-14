class MaxSumSizeK {
    public static double findMaxAverage(int[] nums, int k) {
        int curr = 0;

        for (int i=0; i<k; i++) {
            curr = curr + nums[i];
        }

        int max = curr;

        for (int i=k; i<nums.length; i++) {
            curr = curr + nums[i] - nums[i-k];
            max = Math.max(max, curr);
        }

        return (double) max/k;
    }

    public static void main(String[] args) {
        int nums[] = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums, 4));
    }
}