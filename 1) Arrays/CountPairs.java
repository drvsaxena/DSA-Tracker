class CountPairs {
    public static int subarraySum(int[] nums, int k) {
        int tp=0;
        for (int i=0; i<nums.length; i++) {
            int sum = 0;
            for(int j=i; j<nums.length; j++) {
                sum = sum + nums[j]; 
                if (sum == k) {
                    tp++;
                }
            }
        }
        return tp;
    }

    public static void main(String args[]) {
        int nums[] = {1,1,1};
        int target = 2;
        System.out.println(subarraySum(nums,target));
    }
}