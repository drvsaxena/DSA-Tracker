import java.util.Arrays;

public class RemoveDuplicatesArr {
    public static void duplicates(int nums[]) {
        Arrays.sort(nums);
        int temp[] = new int[nums.length];
        int k = 0;

        for(int i=0; i<nums.length-1; i++) {
            if (nums[i] != nums[i+1]) {
                temp[k++] = nums[i];
            }
        }
        int result[] = Arrays.copyOf(temp, k);
        System.out.print(Arrays.toString(result));
    }

    public static void main(String[] args) {
        int nums[] = {3,2,2,3,1,4,5};
        duplicates(nums);
    }
}
