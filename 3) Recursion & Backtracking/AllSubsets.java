import java.util.*;

public class AllSubsets {
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3}; // You can change this array
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<>(), result);

        // Printing all subsets
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }

    // Backtracking function to generate all subsets
    private static void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        // Add the current subset to the result
        result.add(new ArrayList<>(current));

        // Loop through remaining elements to form new subsets
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]); // Include element
            generateSubsets(i + 1, nums, current, result); // Recurse
            current.remove(current.size() - 1); // Backtrack
        }
    }   
}
