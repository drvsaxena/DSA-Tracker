import java.util.Arrays;
import java.util.HashMap;

public class SubArrWithSum {
    public static int[] arraySum(int nums[], int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int currSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];

            // Case 1: Subarray from index 0 to i has sum k
            if (currSum == k) {
                return new int[]{0, i};
            }

            // Case 2: Subarray found using prefix sum
            if (hm.containsKey(currSum - k)) {
                return new int[]{hm.get(currSum - k) + 1, i};
            }

            // Store prefix sum with index
            hm.put(currSum, i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int nums[] = {10, 15, -5, 15, -10, 5};
        System.out.println(Arrays.toString(arraySum(nums, 5)));
    }
}
