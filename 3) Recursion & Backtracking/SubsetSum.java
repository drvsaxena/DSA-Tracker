import java.util.*;

public class SubsetSum {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3}; // You can modify this input
        List<Integer> result = new ArrayList<>();

        calculateSubsetSums(nums, 0, 0, result);

        // Optional: sort the result
        Collections.sort(result);

        // Print all subset sums
        for (int sum : result) {
            System.out.println(sum);
        }
    }

    // Recursive function to calculate all subset sums
    private static void calculateSubsetSums(int[] nums, int index, int currentSum, List<Integer> result) {
        if (index == nums.length) {
            result.add(currentSum);
            return;
        }

        // Include the current element
        calculateSubsetSums(nums, index + 1, currentSum + nums[index], result);

        // Exclude the current element
        calculateSubsetSums(nums, index + 1, currentSum, result);
    }
}
