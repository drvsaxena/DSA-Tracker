public class MaxConsecutives1s {
    public static int maxOnes(int nums[]) {
        int maxCount = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 1) {
                int count=0;
                int j=i;
                
                while (j<nums.length && nums[j] == 1) {
                    count++;
                    j++;
                }

                if (count > maxCount) {
                    maxCount = count;
                }
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int nums[] = {0,1,1,1,1,0,1,1,1};
        System.out.println("Max consecutives ones are: " + maxOnes(nums));
    }
    
}
