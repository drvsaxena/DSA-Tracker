import java.util.Arrays;
import java.util.HashSet;

public class Intersection {
    
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();

        for (int i : nums1) {
            hs.add(i);
        }

        for (int i : nums2) {
            if (hs.contains(i)) {
                res.add(i);
            }
        }

        int index=0;
        int result[] = new int[res.size()];
        for (int i : res) {
            result[index++] = i;
        }
        
        return result;
    }    


    public static void main(String[] args) {
        int nums1[] = {4,9,5};
        int nums2[] = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}
