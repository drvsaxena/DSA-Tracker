import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    //BRUTE FORCE APPROACH (O(n^2))
    // public static int[] twoSum(int[] nums, int target) {
    //     for (int i=0; i<nums.length; i++) {
    //         for (int j=i+1; j<nums.length; j++) {
    //             if (nums[i] + nums[j] == target) {
    //                 return new int[]{i,j};
    //             }
    //         }
    //     }
    //     return new int[]{};
    // }


    //HASHMAP OPTIMZED APPROACH (O(n))
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int second = target - nums[i];
            if (hm.containsKey(second)) {
                return new int[]{hm.get(second),i};
            }
            hm.put(nums[i], i);
        }
        return new int[]{};
    }


    //TWO POINTER APPROACH BETTER (O(nlogn))
    // public static int[] twoSum(int nums[],int target) {
    //     Arrays.sort(nums);
    //     int first = 0;
    //     int last = nums.length - 1;
    //     for (int i=0; i<nums.length; i++) {
    //         int sum = nums[first] + nums[last];
    //         if (sum > target) {
    //             last--;
    //         }          
    //         if (sum < target) {
    //             first++;
    //         }
    //         if (sum == target) {
    //             return new int[]{first,last};
    //         }  
    //     }
    //     return new int[]{};
    // }


    public static void main(String[] args) {
        int nums[] = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    
}
