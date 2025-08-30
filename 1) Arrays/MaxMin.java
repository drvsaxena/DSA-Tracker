public class MaxMin {
    public static int maxNum (int nums[]) {
        Integer MAX = Integer.MIN_VALUE;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] > MAX) {
                MAX = nums[i];
            }
        }
        return MAX;
    }
    
    public static int minNum (int nums[]) {
        Integer MIN = Integer.MAX_VALUE;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] < MIN) {
                MIN = nums[i];
            }
        }
        return MIN;
    }
    
    public static void main(String[] args) {
        int nums[] = {2,3,8,4,9,7,1};
        System.out.println("Max Number: " + maxNum(nums));   
        System.out.println("Min Number: " + minNum(nums));   
    }
}
