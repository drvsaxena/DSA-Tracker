public class reverse_array{
    public static void reverse(int nums[]) {
        int first = 0;
        int last = nums.length-1;

        while(first < last) {
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int nums[] = {5,4,3,2,1};
        reverse(nums);
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}