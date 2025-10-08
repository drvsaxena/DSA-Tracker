import java.util.HashMap;

public class SubArrayWithSum {
    public static void arraySum(int nums[], int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int prefixSum = 0;
        for(int i=0; i<nums.length; i++) {
            prefixSum += nums[i];
            if (prefixSum == k) {
                System.out.println("Subarray with 0 - "+i);
                for (int j=0; j<i; j++) {
                    System.out.print(j + " ");
                }
                return;
            }

            if (hm.containsKey(prefixSum - k)) {
                int start = (prefixSum - k) + 1;
                System.out.println("Subarray from "+ start + " - " + i);
            }

            hm.put(prefixSum, i);
        }
    }

    public static void main(String[] args) {
        int nums[] = {10, 2, -2, -20, 10};
        int k = -10;

        arraySum(nums, k);
    }
}
