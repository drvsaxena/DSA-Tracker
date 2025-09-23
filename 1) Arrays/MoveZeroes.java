import java.util.Arrays;

public class MoveZeroes {
    public static void move(int nums[]) {
        int left=0;
        int right=0;
        for (right=0; right<nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }

    public static void move2(int nums[]) {
        int i=0;
        int y=1;
        while (y<nums.length) {
            if (nums[i] == 0 && nums[y] != 0) {
                int temp = nums[y];
                nums[y] = nums[i];
                nums[i] = temp;
                i++;
            } 
            else if (nums[i] != 0) {
                i++;
            }
            y++;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int nums[] = {0, 1, 0, 3, 12};
        move(nums);
        for (int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        int nums2[] = {0, 1, 0, 3, 12};
        move2(nums2);
    }
    
}
