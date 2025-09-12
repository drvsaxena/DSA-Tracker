import java.util.Arrays;

public class FirstLastPosition {
    public static int[] searchRange(int nums[],int target) {

        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first,last};
    }

    public static int findFirst(int nums[], int target) {
        int first = 0;
        int last = nums.length-1;

        int ans = -1;

        while (first<=last) {
            int mid = (first+last)/2;
            if (nums[mid] == target) {
                ans=mid;
                last = mid-1;                
            } 
            else if (nums[mid] < target) {
                first = mid+1;
            } else {
                last = mid-1;
            }
        }
        return ans;
    }
    
    public static int findLast(int nums[], int target) {
        int first = 0;
        int last = nums.length-1;

        int ans = -1;

        while (first<=last) {
            int mid = (first+last)/2;
            if (nums[mid] == target) {
                ans=mid;
                first = mid+1;                
            } 
            else if (nums[mid] < target) {
                first = mid+1;
            } else {
                last = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}
