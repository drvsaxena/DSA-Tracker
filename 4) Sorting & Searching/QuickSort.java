import java.util.Arrays;

public class QuickSort {
    public static int partition(int nums[], int left, int right) {
        int pivot = nums[right];
        int i = left - 1;

        for (int j=left; j<right; j++) {
            if (nums[j]<=pivot) {
                i++;
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
        int temp = nums[i+1];
        nums[i+1] = nums[right];
        nums[right] = temp;

        return i+1;
    }

    public static int[] sortQuick(int nums[], int left, int right) {
        if (left<right) {
            int pivotIndex = partition(nums, left, right);

            //SORT LEFT ARRAY
            sortQuick(nums, left, pivotIndex-1);

            //SORT RIGHT ARRAY
            sortQuick(nums, pivotIndex + 1, right);
        }

        return nums;
    }


    public static void main(String[] args) {
        int nums[] = {5, 2, 3, 1, 8, 4};
        System.out.println(Arrays.toString(sortQuick(nums, 0, nums.length-1)));
    }
    
}
