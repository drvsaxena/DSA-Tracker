public class CountPairsSum {
    public static int pairs(int nums[], int sum) {
        int count = 0;

        for(int i=0; i<nums.length - 1; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = {1, 5, 7, -1, 5};
        int sum = 6;
        System.out.print("Count of pairs: " + pairs(nums, sum));
    }
}
