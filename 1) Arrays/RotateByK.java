import java.util.Arrays;

public class RotateByK {
    public static void rotatek2(int nums[],int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int nums[], int first, int last) {
        while (first < last) {
            int temp = nums[last];
            nums[last] = nums[first];
            nums[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int nums2[] = {1,2,3,4,5};
        int k=2;
        rotatek2(nums2, k);        
    }
}
