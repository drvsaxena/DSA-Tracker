import java.util.Arrays;

class MissingNum {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] != 0) {
            return 0;
        }
        for (int i=0; i<nums.length; i++) {
            if (nums[i+1] != nums[i] + 1) {
                return nums[i] + 1;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int nums[] = {3,0,1};
        System.out.println(missingNumber(nums));
    }
}