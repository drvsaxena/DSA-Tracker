public class SearchInRotatedArr {
    public static int InnerSearchInRotatedArr(int nums[],int k) {
        int left=0;
        int right=nums.length-1;
        
        while (left<=right) {
            int mid = (left+right)/2;
            if (nums[mid] == k) {
                return mid;
            }

            if (nums[left] <= nums[mid]) {
                if (k>=nums[left] && k<nums[mid]) {
                    right = mid + 1;
                } else {
                    left = mid - 1;
                }
            }

            if (nums[right] >= nums[mid]) {
                if (k > nums[mid] && k<=nums[right]) {
                    left = mid - 1;
                } else {
                    right = mid + 1;
                }
            }
        }
    return -1;
    }

    
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int k =0;
        System.out.println(InnerSearchInRotatedArr(nums,k));
    }
}