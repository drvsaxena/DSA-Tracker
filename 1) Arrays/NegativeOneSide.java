public class NegativeOneSide{
    public static void negoneside(int nums[]) {
        int j = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] < 0) {
                //Swap only if nums[i] != nums[j]
                if(i != j) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {-1,-2,-3,4,5,6,-7,9,1,-8};
        negoneside(nums);
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}