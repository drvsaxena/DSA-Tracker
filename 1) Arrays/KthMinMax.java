import java.util.*;

public class KthMinMax {
    public static void main(String[] args) {
        int nums[] = {2,3,5,4,6,8};
        int k = 2;
        Arrays.sort(nums);
        
        int kmin = nums[k-1];
        int kmax = nums[nums.length - k];
        System.out.println("Kth Min: " + kmin);
        System.out.print("Kth Max: " + kmax);
    }
}
