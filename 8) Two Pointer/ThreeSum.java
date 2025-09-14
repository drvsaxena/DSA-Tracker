import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length<3) return new ArrayList<>();
        Set<List<Integer>> hs = new HashSet<>();

        Arrays.sort(nums);

        for (int i=0; i<nums.length-2; i++) {
            int first = i+1;
            int last = nums.length-1;

            while (first<last) {
                int sum = nums[i] + nums[first] + nums[last];

                if (sum == 0) {
                    hs.add(Arrays.asList(nums[i],nums[first],nums[last]));
                    first++;
                    last--;
                } 
                else if (sum<0) {
                    first++;
                } else {
                    last--;
                }
            }
        }
        return new ArrayList<>(hs);
    }


    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
