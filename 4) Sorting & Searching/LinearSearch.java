public class LinearSearch {
    public static int searchLinear(int nums[], int k) {
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == k) {
                return i;
            }
        }
        return -1;
    } 


    public static void main(String[] args) {
        int nums[] = {3,4,2,3,5,7};
        System.out.println(searchLinear(nums, 3));
    }
    
}

