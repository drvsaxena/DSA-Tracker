import java.util.*;

public class powerset {
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3}; // You can change the input array
        List<List<Integer>> powerSet = generatePowerSet(nums);
        
        // Printing the power set
        for (List<Integer> subset : powerSet) {
            System.out.println(subset);
        }
    }

    public static List<List<Integer>> generatePowerSet(int[] nums) {
        int n = nums.length;
        int total = 1 << n; // 2^n subsets
        List<List<Integer>> result = new ArrayList<>();

        for (int mask = 0; mask < total; mask++) {
            List<Integer> subset = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    subset.add(nums[i]);
                }
            }
            result.add(subset);
        }

        return result;
    }
}
